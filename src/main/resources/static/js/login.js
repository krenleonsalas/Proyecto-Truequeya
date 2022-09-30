const login = () => {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if (username == "") {
        showError("Username is required");
        return;
    }
    if (password == "") {
        showError("Password is required");
        return;
    }

    const body = {
        "username": username,
        "password": password
    };
    postToLogin(body);


};

const postToLogin = async (bodyObject) => {
    const url = "/api/login";
    const response = await fetch(url, {
        method: "POST",
        body: JSON.stringify(bodyObject),
        headers: {
            "Content-Type": "application/json"
        }
    });

    if (response.ok) {
        const user = await response.json();

        localStorage.setItem("loggedUser", JSON.stringify(user));
          
        window.location.reload()
    } else {
        const message = await response.text();
        showError(message);
    }
};

const showError = (message) => {
    alert(message, "danger");
}

const alert = (message, type) => {
    document.getElementById("errorBox").innerHTML = [
        `<div class="alert alert-${type} alert-dismissible" role="alert">`,
        `   <div>${message}</div>`,
        '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
        '</div>'
    ].join('')
}