/** @type {import('tailwindcss').Config} */
module.exports = {
    content: ["../resources/templates/**/*.{html,js}"],
    theme: {
        extend: {
            colors: {
                'sd-background': '#004643',  // Dark teal
                'sd-headline': '#fffffe',    // White for
                'sd-paragraph': '#abd1c6',   // Light teal
                'sd-button': '#f9bc60',      // Gold/yellow
                'sd-button-text': '#001e1d', // Dark color
                'sd-stroke': '#001e1d',      // Dark color
                'sd-main': '#e8e4e6',        // Light gray
                'sd-highlight': '#f9bc60',   // Gold/yellow
                'sd-secondary': '#abd1c6',   // Light teal
                'sd-tertiary': '#e16162'     // Red/coral
            }
        },
    },
    plugins: [],
}