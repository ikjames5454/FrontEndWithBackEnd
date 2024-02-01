function showSuccessMessage(message) {
    document.getElementById('successMessage').style.display = 'block';
    document.getElementById('successMessage').getElementsByTagName('p')[0].innerText = message;
}

// Function to display error message
function showErrorMessage(message) {
    document.getElementById('errorMessage').style.display = 'block';
    document.getElementById('errorMessage').getElementsByTagName('p')[0].innerText = message;
}

// Submit form with AJAX
document.getElementById('registerForm').addEventListener('submit', function (event) {
    event.preventDefault();

    // Perform AJAX request to submit the form data
    // Update the showSuccessMessage and showErrorMessage functions based on the AJAX response
    // For simplicity, I'm using a placeholder function here
    simulateAjaxRequest();
});

// Placeholder for AJAX request simulation
function simulateAjaxRequest() {
    // Assume a successful response
    const response = {success: true, message: 'Registration successful'};

    if (response.success) {
        // Display success message
        showSuccessMessage(response.message);
    } else {
        // Display error message
        showErrorMessage(response.message);
    }
}