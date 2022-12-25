package DesignPrinciples.LibraryManagementSystem.Tester;

import java.util.*;

public class Tester {

  public List<BookCopy> searchBooksByBookName(String bookname) {

  }

  public List<BookCopy> searchBooksByAuthorNames(List<String> authorNames) {

  }

  public List<Member> searchMemberByMemberName(String memberName) {

  }

  public void addBookCopy(String bookName, List<String> authorNames, Date pubDate, String adminToken) {

  }

  public void deleteBook(int bookCopyId, String adminToken) {

  }

  public void blockMember(int memberId, String adminToken) {

  }

  public void issueBook(int bookCopyId, int memberId, String adminToken) {

  }

  public void submitBook(int bookCopyId, int memberId, String adminToken) {

  }

  public Member getBorrowerOfBook(int bookCopyId, String adminToken) {

  }

  public List<BookCopy> getBooksBorrowedByMember(int memberId, String adminToken) {

  }

}