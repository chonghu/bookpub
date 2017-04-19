package org.test.bookpub;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

public class IsbnEditor extends PropertyEditorSupport {
	
	public IsbnEditor() {
		
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.hasText(text)) {
			setValue(new Isbn(text.trim()));
		} else {
			setValue(null);
		}
	}

	@Override
	public String getAsText() {
		Isbn isbn = (Isbn) getValue();
		if (isbn != null) {
			return isbn.getIsbn();
		} else {
			return "";
		}
	}
}
