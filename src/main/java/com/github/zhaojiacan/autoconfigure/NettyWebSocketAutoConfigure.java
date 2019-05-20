package com.github.zhaojiacan.autoconfigure;

import com.github.zhaojiacan.annotation.EnableWebSocket;
import com.github.zhaojiacan.standard.ServerEndpointExporter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@EnableWebSocket
@ConditionalOnMissingBean(ServerEndpointExporter.class)
public class NettyWebSocketAutoConfigure {
}
