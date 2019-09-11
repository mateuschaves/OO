import java.util.ArrayList;
import java.util.*;

class Antenna {
    private List<Channel> channelsAllowed = new ArrayList<Channel>();

    public List<Channel> getChannelsAllowed() {
        return this.channelsAllowed;
    }

    public Boolean isChannelAvailable(Channel channel) {
        for (Channel c : channelsAllowed) {
            if (c.getNumber() == channel.getNumber() && c.getStatus() == 1) {
                return true;
            }
        }
        return false;
    }

    public void setChannelsAllowed(List<Channel> channelsAllowed) {
        this.channelsAllowed = channelsAllowed;
    }

    public Antenna(List<Channel> channelsAllowed) {
        this.setChannelsAllowed(channelsAllowed);
    }
}