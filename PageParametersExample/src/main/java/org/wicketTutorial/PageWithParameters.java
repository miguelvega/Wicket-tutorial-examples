package org.wicketTutorial;

import java.io.File;
import java.util.Date;

import org.apache.wicket.Application;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.link.StatelessLink;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class PageWithParameters extends WebPage {

	public PageWithParameters() {
		super();
	}

	public PageWithParameters(IModel<?> model) {
		super(model);
	}

	public PageWithParameters(PageParameters parameters) {
		super(parameters);
		setStatelessHint(true);
	}
	
	@Override
	protected void onInitialize() {		
		super.onInitialize();
		setDefaultModel(new Model());
		add(new StatelessLink<File>("goBack") {

			@Override
			public void onClick() {
				setResponsePage(getApplication().getHomePage());
			}
		});
	}	
}
