package com.ecwid.consul.v1.catalog;

import java.util.List;
import java.util.Map;

import com.ecwid.consul.v1.QueryParams;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.catalog.model.CatalogDeregistration;
import com.ecwid.consul.v1.catalog.model.CatalogNode;
import com.ecwid.consul.v1.catalog.model.CatalogRegistration;
import com.ecwid.consul.v1.catalog.model.Node;

/**
 * @author Vasily Vasilkov (vgv@ecwid.com)
 */
public interface CatalogClient {

	public Response<Void> catalogRegister(CatalogRegistration catalogRegistration);

	public Response<Void> catalogDeregister(CatalogDeregistration catalogDeregistration, CatalogDeregistration... catalogDeregistrations);

	public Response<List<String>> getCatalogDatacenters();

	public Response<List<Node>> getCatalogNodes(QueryParams queryParams);

	public Response<Map<String, List<String>>> getCatalogServices(QueryParams queryParams);

	public Response<List<com.ecwid.consul.v1.catalog.model.CatalogService>> getCatalogService(String serviceName, QueryParams queryParams);

	public Response<List<com.ecwid.consul.v1.catalog.model.CatalogService>> getCatalogService(String serviceName, String tag, QueryParams queryParams);

	public Response<CatalogNode> getCatalogNode(String nodeName, QueryParams queryParams);
}
