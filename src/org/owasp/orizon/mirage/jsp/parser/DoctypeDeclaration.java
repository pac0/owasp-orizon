/* Generated by: FreeCC 0.9.3. Do not edit. DoctypeDeclaration.java */
package org.owasp.orizon.mirage.jsp.parser;

public class DoctypeDeclaration extends BaseNode {
    private String name;
    public String toString() {
        return super.toString()+" - "+getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public DoctypeDeclaration(int id) {
        super(id);
    }

    public DoctypeDeclaration() {
        super(JspConstants.DOCTYPEDECLARATION);
    }

}
