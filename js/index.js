// Seleciona o botão pelo ID ou classe
const toggleButton = document.getElementById('darkModeToggle');

toggleButton.addEventListener('click', () => {
    // Adiciona ou remove a classe dark-mode no body
    document.body.classList.toggle('dark-mode');

    // Alterna o texto do botão
    if (document.body.classList.contains('dark-mode')) {
        toggleButton.textContent = 'Modo Claro';
    } else {
        toggleButton.textContent = 'Modo Escuro';
    }
});
