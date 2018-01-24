/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo;

import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author Ilayaperumal Gopinathan
 */
//@EnableBinding(SampleSource.Source.class)
public class SampleSource {

//	@Bean
//	@InboundChannelAdapter(value = Source.SAMPLE, poller = @Poller(fixedDelay = "50000", maxMessagesPerPoll = "1"))
//	public MessageSource<Bar> timerMessageSource() {
//		return new MessageSource<Bar>() {
//			public Message<Bar> receive() {
//				System.out.println("******************");
//				String value = "hi " + System.currentTimeMillis() / 1000;
//				// String value = "{\"value\":\""+v+"\"}";
//				Bar bar = new Bar();
//				bar.setValue(value);
//				Message<Bar> msg = MessageBuilder.withPayload(bar).build();
//				System.out.println("Sending value: [" + msg + "]");
//				System.out.println("******************");
//				return msg;
//			}
//		};
//	}

//	@Bean
//	@InboundChannelAdapter(value = Source.SAMPLE, poller = @Poller(fixedDelay = "50000", maxMessagesPerPoll = "1"))
//	public MessageSource<RemoteApplicationEvent> timerMessageSource() {
//		return new MessageSource<RemoteApplicationEvent>() {
//			public Message<RemoteApplicationEvent> receive() {
//				System.out.println("******************");
//				String value = "{\"value\":\"hi " + System.currentTimeMillis() / 1000 + "\"}";
//				RemoteApplicationEvent event = new RefreshRemoteApplicationEvent(value, "originService",
//						"destinationService");
//				Message<RemoteApplicationEvent> msg = MessageBuilder.withPayload(event).build();
//				System.out.println("Sending value: [" + msg + "]");
//				System.out.println("******************");
//
//				
//				return msg;
//			}
//		};
//	}

//	public interface Source {
//		String SAMPLE = "sample-source";
//
//		@Output(SAMPLE)
//		MessageChannel sampleSource();
//	}
}
