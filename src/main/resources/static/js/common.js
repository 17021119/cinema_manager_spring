//modal add
var btnAdd = document.querySelector('.btn-add');
var modalAdd = document.querySelector('.modal-add');
var closeAdd = document.querySelector('.modal-add .modal__close');
var modalContainerAdd = document.querySelector(".modal-add .modal__container")

function showModalAdd() {
    modalAdd.classList.add('open');
}

function hideModalAdd() {
    modalAdd.classList.remove('open');
}
btnAdd.addEventListener('click', showModalAdd);
closeAdd.addEventListener('click', hideModalAdd);
modalAdd.addEventListener("click", hideModalAdd);
modalContainerAdd.addEventListener("click", function(event) {
    event.stopPropagation();
})
//modal edit
var btnEdits = document.querySelectorAll('.btn-edit');
var modalEdit = document.querySelector('.modal-edit');
var closeEdit = document.querySelector('.modal-edit .modal__close');
var modalContainerEdit = document.querySelector(".modal-edit .modal__container")

function showModalEdit() {
    modalEdit.classList.add('open');
}

function hideModalEdit() {
    modalEdit.classList.remove('open');
}
for (btnEdit of btnEdits) {
    btnEdit.addEventListener('click', showModalEdit);
}

closeEdit.addEventListener('click', hideModalEdit);
modalEdit.addEventListener("click", hideModalEdit);
modalContainerEdit.addEventListener("click", function(event) {
    event.stopPropagation();
})

// modal delete
var btnDeletes = document.querySelectorAll('.btn-delete');
var modalDelete = document.querySelector('.modal-delete');
var closeDelete = document.querySelector('.modal-delete .modal__close');
var modalContainerDelete = document.querySelector(".modal-delete .modal__container")
var btnNo = document.querySelector(".btn-no");

function showModalDelete() {
    modalDelete.classList.add('open');
}

function hideModalDelete() {
    modalDelete.classList.remove('open');
}
for (btnDelete of btnDeletes) {
    btnDelete.addEventListener('click', showModalDelete);
}

closeDelete.addEventListener('click', hideModalDelete);
modalDelete.addEventListener("click", hideModalDelete);
btnNo.addEventListener("click", hideModalDelete);
modalContainerDelete.addEventListener("click", function(event) {
    event.stopPropagation();
})

$(document).ready(function () {
    $('table .btn').on('click', function (event) {
        event.preventDefault();
        console.log("This is btn");

    });

    $('.btn-edit-film').on('click', function (event) {
        var href= $(this).attr('href');
        $.get(href, function (film, status) {
            console.log(film);
            console.log(status);
            $('#id-film').val(film.id);
            $('#name-film-edit').val(film.name);
            $('#banner-film-edit').val(film.banner);
            $('#active-film-edit').val(film.active);
            $('#directors-film-edit').val(film.directors);
            $('#actors-film-edit').val(film.actors);
            $('#category-film-edit').val(film.category);
            $('#openDay-film-edit').val(film.openDay);
            $('#time-film-edit').val(film.time);
            $('#price-film-edit').val(film.price);
            $('#description-film-edit').val(film.description);
        });
    })

    $('.btn-edit-customer').on('click', function (event) {
        var href= $(this).attr('href');
        $.get(href, function (customer, status){
            console.log(customer);
            $('#id-customer').val(customer.id);
            $('#id-cart').val(customer.cart.cartId);
            $('#fullName-edit').val(customer.fullName);
            $('#username-edit').val(customer.user.username);
            $('#cmnd-edit').val(customer.cmnd);
            $('#phone-edit').val(customer.phone);
            $('#email-edit').val(customer.email);
            $('#address-edit').val(customer.address);
            // $('#male-edit').val(customer.male );
            document.getElementById('male-edit').value= customer.male ;
            $('#date-register-edit').val(customer.dateRegister);
            // $('#roles-edit').val(customer.user.roles);
            document.getElementById('roles-edit').value= customer.user.roles;
            // $('#is-active-edit').val(customer.user.active).change();
            document.getElementById('is-active-edit').value= customer.user.active;
        });
    })
})