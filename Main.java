package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


// 1. the main method will contain user interface to allow book selection
// 2. the books to be stored in another class which can be manipulated ie. add books
// 3. the 10% discount will me done in one methods
// 4. the > £30 get 5% discount will be another method

//update:
// discount on books which are £30 in total WORKS
// discounts on all books past 2000 does not work yet


public class Main {
	public static ArrayList<String[]> readData() throws IOException {
		int count = 0;
		String file = "com/company/BookShelf.csv";
		ArrayList<String[]> content = new ArrayList<>();

		try(BufferedReader br = new BufferedReader(new FileReader("com/company/BookShelf.csv"))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				content.add(line.split(","));
			}
		}
		System.out.println(content);
		return content;
	}

	public static class JListSelected extends JFrame{
		public JListSelected(){
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			getContentPane().setLayout(new FlowLayout());
//			Arraylist to hold data
			ArrayList<String> Books = new ArrayList<>();
//			add data
			for (int i = 0; i< 10; i++){
				Books.add( "Book"+ i) ;
			}

			final JList<String> list = new JList(Books.toArray());
			getContentPane().add(list);

			JButton btn = new JButton("Get Selected");
			getContentPane().add(btn);

//			on click listener
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					display information
					System.out.println("Selected Values");
					int [] indices = list.getSelectedIndices();

					for (int i =0; i< indices.length; i++){
						System.out.println("Book " + indices[i]);
					}


				}
			});
			setSize(250,250);
		}


	}

    public static void main(String[] args) {
	    
	Book book1, book2, book3;

	book1 = new Book(" Moby Dick", 1920, 20.20);
	book2 = new Book(" The Terrible Privacy of Maxwell", 2010, 12.14);
	book3 = new Book("Still Life With Woodpecker", 1980, 11.05);



	double amount1 = (double) Discounts.TenDiscount(book1.getYear() + book2.getYear(),book1.getPrice() + book2.getPrice());
	System.out.println(amount1);


	double amount2 = (double) Discounts.BooksOver30(book1.getPrice() + book2.getPrice() + book3.getPrice());
	System.out.println(amount2);


    }
}
