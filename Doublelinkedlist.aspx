using System;
using System.Collections;
using System.Text;

namespace DoubleLinkedList
{
public class Node {
public Object Element;
public Node FLink;
public Node BLink;


public Node() {
Element = null;
FLink = null;
BLink = null;

}
public Node(Object theElement) {
Element = theElement;
FLink = null;
BLink = null;
}}

public class DoubleLinkedList {
protected Node header;

public DoubleLinkedList() {
header = new Node("header");
}

private Node Find(Object item) {
Node current = new Node();
current = header;
while(current.Element != item && current.FLink != null)
current = current.FLink;
return current;
}

public void Insert(Object newItem, Object after) {
Node current = new Node();
Node newNode = new Node(newItem);
current = Find(after);
newNode.FLink = current.FLink;
newNode.BLink = current;
current.FLink = newNode;
if(newNode.FLink !=null)
newNode.FLink.BLink= newNode;
}


 
public void Remove(Object n) {
Node p = Find(n);
if (!(p.FLink == null)) {
p.BLink.FLink = p.FLink;
p.FLink.BLink = p.BLink;
p.FLink = null;
p.BLink = null;}
else
{p.BLink.FLink=null;
p.BLink=null;
}}

public void PrintList() {
Node current = new Node();
current = header;
while (!(current.FLink == null)) {
Console.WriteLine(current.FLink.Element);
current = current.FLink;
}}}
