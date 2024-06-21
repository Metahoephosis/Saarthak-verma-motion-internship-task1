import java.util.*;

 // Compiler version JDK 11.0.2

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pricing Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header class="header">
        <h1>Our Pricing Plans</h1>
    </header>

    <section class="pricing">
        <div class="pricing-plan">
            <h2>Basic</h2>
            <p class="price">$10/month</p>
            <ul>
                <li>Feature 1</li>
                <li>Feature 2</li>
                <li>Feature 3</li>
            </ul>
            <button class="btn">Choose Plan</button>
        </div>
        
        <div class="pricing-plan">
            <h2>Standard</h2>
            <p class="price">$20/month</p>
            <ul>
                <li>Feature 1</li>
                <li>Feature 2</li>
                <li>Feature 3</li>
            </ul>
            <button class="btn">Choose Plan</button>
        </div>
        
        <div class="pricing-plan">
            <h2>Premium</h2>
            <p class="price">$30/month</p>
            <ul>
                <li>Feature 1</li>
                <li>Feature 2</li>
                <li>Feature 3</li>
            </ul>
            <button class="btn">Choose Plan</button>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 Your Company Name. All rights reserved.</p>
    </footer>
</body>
</html>




/* styles.css */

/* Basic Reset */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    background-color: #f9f9f9;
    color: #333;
}

.header {
    background-color: #4CAF50;
    color: white;
    text-align: center;
    padding: 1rem;
}

.pricing {
    display: flex;
    justify-content: center;
    gap: 2rem;
    margin: 2rem;
}

.pricing-plan {
    background-color: white;
    border: 1px solid #ddd;
    border-radius: 10px;
    padding: 2rem;
    text-align: center;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    flex: 1;
    max-width: 300px;
}

.pricing-plan h2 {
    margin-bottom: 1rem;
}

.price {
    font-size: 2rem;
    color: #4CAF50;
    margin-bottom: 1rem;
}

.pricing-plan ul {
    list-style-type: none;
    margin-bottom: 1rem;
}

.pricing-plan li {
    padding: 0.5rem 0;
}

.btn {
    background-color: #4CAF50;
    color: white;
    padding: 0.75rem 1.5rem;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

.btn:hover {
    background-color: #45a049;
}

.footer {
    text-align: center;
    padding: 1rem;
    background-color: #f1f1f1;
    margin-top: 2rem;
}

@media (max-width: 768px) {
    .pricing {
        flex-direction: column;
        align-items: center;
    }
}




<!-- Add this to your HTML file -->
<div class="toggle-container">
    <label for="toggle">Monthly/Yearly</label>
    <input type="checkbox" id="toggle">
</div>

<!-- Update pricing plans with yearly prices -->
<p class="price yearly">$100/year</p>

<!-- Add this script to the end of your HTML body -->
<script>
    const toggle = document.getElementById('toggle');
    const monthlyPrices = document.querySelectorAll('.price.monthly');
    const yearlyPrices = document.querySelectorAll('.price.yearly');

    toggle.addEventListener('change', () => {
        if (toggle.checked) {
            monthlyPrices.forEach(price => price.style.display = 'none');
            yearlyPrices.forEach(price => price.style.display = 'block');
        } else {
            monthlyPrices.forEach(price => price.style.display = 'block');
            yearlyPrices.forEach(price => price.style.display = 'none');
        }
    });
</script>