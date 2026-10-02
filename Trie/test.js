const url = "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub";
printGrid(url);

async function printGrid(url) {
    // Fetch the published Google Doc
    const response = await fetch(url);

    if (!response.ok) {
        throw new Error("Failed to fetch the Google Doc");
    }

    const html = await response.text();

    // Extract all table rows
    const rows = html.match(/<tr[\s\S]*?<\/tr>/gi) || [];

    const grid = new Map();

    let maxX = 0;
    let maxY = 0;

    for (const row of rows) {
        // Extract all cells from the current row
        const cells = row.match(/<td[\s\S]*?<\/td>/gi) || [];

        if (cells.length < 3) {
            continue;
        }

        const values = cells.map(cell => {
            // Remove HTML tags
            let text = cell.replace(/<[^>]*>/g, "");

            // Decode common HTML entities
            text = text
                .replace(/&nbsp;/g, " ")
                .replace(/&amp;/g, "&")
                .replace(/&lt;/g, "<")
                .replace(/&gt;/g, ">")
                .replace(/&#(\d+);/g, (_, code) =>
                    String.fromCodePoint(Number(code))
                )
                .replace(/&#x([0-9a-f]+);/gi, (_, code) =>
                    String.fromCodePoint(parseInt(code, 16))
                );

            return text.trim();
        });

        // Skip the header row
        const x = Number(values[0]);
        const character = values[1];
        const y = Number(values[2]);

        if (
            !Number.isInteger(x) ||
            !Number.isInteger(y) ||
            character.length === 0
        ) {
            continue;
        }

        // Store the character at its coordinate
        grid.set(`${x},${y}`, character);

        maxX = Math.max(maxX, x);
        maxY = Math.max(maxY, y);
    }

    // Print the grid.
    // x increases from left to right.
    // y increases from top to bottom.
    for (let y = 0; y <= maxY; y++) {
        let row = "";

        for (let x = 0; x <= maxX; x++) {
            row += grid.get(`${x},${y}`) || " ";
        }

        console.log(row);
    }
}
