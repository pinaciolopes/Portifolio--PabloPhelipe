const toggleButton = document.getElementById("darkModeToggle");

toggleButton.addEventListener("click", () => {
    document.body.classList.toggle("dark-mode");
    toggleButton.textContent = document.body.classList.contains("dark-mode") ? "Modo Claro" : "Modo Escuro";
});

document.querySelectorAll(".toggle-btn").forEach(btn => {
    btn.addEventListener("click", function () {
        const detalhes = this.parentElement.querySelector(".detalhes");
        if (detalhes.style.display === "none" || detalhes.style.display === "") {
            detalhes.style.display = "block";
            this.textContent = "Ler menos";
        } else {
            detalhes.style.display = "none";
            this.textContent = "Ler mais";
        }
    });
});
