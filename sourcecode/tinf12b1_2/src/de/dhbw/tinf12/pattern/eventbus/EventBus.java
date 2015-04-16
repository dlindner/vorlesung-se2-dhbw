package de.dhbw.tinf12.pattern.eventbus;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EventBus {

	private final Map<String, Set<NewsReceiver>> receivers;

	public EventBus() {
		super();
		this.receivers = new HashMap<String, Set<NewsReceiver>>();
	}

	public void post(News news, String topic) {
		if (containsWildcards(topic)) {
			postWithWildcards(news, topic);
			return;
		}
		postDirectly(news, topic);
	}

	private void postDirectly(News news, String topic) {
		for (NewsReceiver each : receiversFor(topic)) {
			each.receive(news);
		}
	}

	private void postWithWildcards(News news, String topic) {
		for (String each : this.receivers.keySet()) {
			if (each.matches(topic.replace("*", ".*"))) {
				postDirectly(news, each);
			}
		}
	}

	private boolean containsWildcards(String topic) {
		return topic.endsWith("*");
	}

	public void subscribe(String topic, NewsReceiver receiver) {
		receiversFor(topic).add(receiver);
	}

	public void unsubscribe(String topic, NewsReceiver receiver) {
		receiversFor(topic).remove(receiver);
	}

	protected Set<NewsReceiver> receiversFor(String topic) {
		if (!this.receivers.containsKey(topic)) {
			this.receivers.put(topic, new LinkedHashSet<NewsReceiver>());
		}
		return this.receivers.get(topic);
	}
}
