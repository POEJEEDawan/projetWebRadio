package fr.dawan.webRadio.filtres;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class FiltreUpload implements Filter {

	public FiltreUpload() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	    chain.doFilter(request, new HttpServletResponseWrapper((HttpServletResponse) response));
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		if (req.getSession().getAttribute("activated") == null) {
			res.sendError(403, "identifiez vous pour accéder à la page upload");
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		Filter.super.destroy();
	}

}
