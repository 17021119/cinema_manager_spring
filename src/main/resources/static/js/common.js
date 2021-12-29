// //modal add
// var btnAdd = document.querySelector('.btn-add');
// var modalAdd = document.querySelector('.modal-add');
// var closeAdd = document.querySelector('.modal-add .modal__close');
// var modalContainerAdd = document.querySelector(".modal-add .modal__container")
//
// function showModalAdd() {
//     modalAdd.classList.add('open');
// }
//
// function hideModalAdd() {
//     modalAdd.classList.remove('open');
// }
// btnAdd.addEventListener('click', showModalAdd);
// closeAdd.addEventListener('click', hideModalAdd);
// modalAdd.addEventListener("click", hideModalAdd);
// modalContainerAdd.addEventListener("click", function(event) {
//     event.stopPropagation();
// })
// //modal edit
// var btnEdits = document.querySelectorAll('.btn-edit');
// var modalEdit = document.querySelector('.modal-edit');
// var closeEdit = document.querySelector('.modal-edit .modal__close');
// var modalContainerEdit = document.querySelector(".modal-edit .modal__container")
//
// function showModalEdit() {
//     modalEdit.classList.add('open');
// }
//
// function hideModalEdit() {
//     modalEdit.classList.remove('open');
// }
// for (btnEdit of btnEdits) {
//     btnEdit.addEventListener('click', showModalEdit);
// }
//
// closeEdit.addEventListener('click', hideModalEdit);
// modalEdit.addEventListener("click", hideModalEdit);
// modalContainerEdit.addEventListener("click", function(event) {
//     event.stopPropagation();
// })
//
// // modal delete
// var btnDeletes = document.querySelectorAll('.btn-delete');
// var modalDelete = document.querySelector('.modal-delete');
// var closeDelete = document.querySelector('.modal-delete .modal__close');
// var modalContainerDelete = document.querySelector(".modal-delete .modal__container")
// var btnNo = document.querySelector(".btn-no");
//
// function showModalDelete() {
//     modalDelete.classList.add('open');
// }
//
// function hideModalDelete() {
//     modalDelete.classList.remove('open');
// }
// for (btnDelete of btnDeletes) {
//     btnDelete.addEventListener('click', showModalDelete);
// }
//
// closeDelete.addEventListener('click', hideModalDelete);
// modalDelete.addEventListener("click", hideModalDelete);
// btnNo.addEventListener("click", hideModalDelete);
// modalContainerDelete.addEventListener("click", function(event) {
//     event.stopPropagation();
// })