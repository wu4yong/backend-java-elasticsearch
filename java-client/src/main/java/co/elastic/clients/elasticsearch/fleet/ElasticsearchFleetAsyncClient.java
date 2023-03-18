/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.fleet;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the fleet namespace.
 */
public class ElasticsearchFleetAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchFleetAsyncClient> {

	public ElasticsearchFleetAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchFleetAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchFleetAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchFleetAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: fleet.search

	/**
	 * Search API where the search will only be executed after specified checkpoints
	 * are available due to a refresh. This API is designed for internal use by the
	 * fleet server project.
	 * 
	 * @see <a href="null">Documentation on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<FleetSearchResponse<TDocument>> search(FleetSearchRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FleetSearchRequest, FleetSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<FleetSearchRequest, FleetSearchResponse<TDocument>, ErrorResponse>) FleetSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:fleet.search.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Search API where the search will only be executed after specified checkpoints
	 * are available due to a refresh. This API is designed for internal use by the
	 * fleet server project.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FleetSearchRequest}
	 * @see <a href="null">Documentation on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<FleetSearchResponse<TDocument>> search(
			Function<FleetSearchRequest.Builder, ObjectBuilder<FleetSearchRequest>> fn,
			Class<TDocument> tDocumentClass) {
		return search(fn.apply(new FleetSearchRequest.Builder()).build(), tDocumentClass);
	}

}
