let books = [
    "Java Programming",
    "Data Structures",
    "Operating Systems",
    "Computer Networks",
    "Web Technology"
];

let issued = [false, false, false, false, false];

function displayBooks() {

    let output = "<h3>Books</h3>";

    for (let i = 0; i < books.length; i++) {

        if (issued[i]) {
            output += (i + 1) + ". " + books[i] + " - Issued<br>";
        } else {
            output += (i + 1) + ". " + books[i] + " - Available<br>";
        }
    }

    document.getElementById("result").innerHTML = output;
}


function issueBook() {

    let bookNumber = prompt(
        "Enter book number to issue (1-5):"
    );

    bookNumber = Number(bookNumber);

    if (bookNumber >= 1 && bookNumber <= 5) {

        if (!issued[bookNumber - 1]) {

            issued[bookNumber - 1] = true;

            document.getElementById("result").innerHTML =
                "Book issued successfully.";

        } else {

            document.getElementById("result").innerHTML =
                "Book is already issued.";
        }

    } else {

        document.getElementById("result").innerHTML =
            "Invalid book number.";
    }
}


function returnBook() {

    let bookNumber = prompt(
        "Enter book number to return (1-5):"
    );

    bookNumber = Number(bookNumber);

    if (bookNumber >= 1 && bookNumber <= 5) {

        if (issued[bookNumber - 1]) {

            issued[bookNumber - 1] = false;

            document.getElementById("result").innerHTML =
                "Book returned successfully.";

        } else {

            document.getElementById("result").innerHTML =
                "Book was not issued.";
        }

    } else {

        document.getElementById("result").innerHTML =
            "Invalid book number.";
    }
}