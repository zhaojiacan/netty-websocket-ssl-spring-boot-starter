package com.codingfan.autoconfigure;

import com.codingfan.annotation.EnableWebSocket;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import com.codingfan.standard.ServerEndpointExporter;

@EnableWebSocket
@ConditionalOnMissingBean(ServerEndpointExporter.class)
public class NettyWebSocketAutoConfigure {
}
