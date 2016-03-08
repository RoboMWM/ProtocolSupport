package protocolsupport.protocol.transformer.middlepacket;

import java.io.IOException;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.storage.LocalStorage;
import protocolsupport.protocol.storage.SharedStorage;

public abstract class ClientBoundMiddlePacket<T> extends MiddlePacket {

	protected LocalStorage storage;
	protected SharedStorage sharedstorage;

	public void setLocalStorage(LocalStorage storage) {
		this.storage = storage;
	}

	public void setSharedStorage(SharedStorage sharedstorage) {
		this.sharedstorage = sharedstorage;
	}

	public void handle() {
	}

	public abstract void readFromServerData(PacketDataSerializer serializer) throws IOException;

	public abstract T toData(ProtocolVersion version) throws IOException;

}
