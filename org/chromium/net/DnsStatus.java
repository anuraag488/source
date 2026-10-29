package org.chromium.net;

import java.net.InetAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class DnsStatus {
    private final List<InetAddress> mDnsServers;
    private final boolean mPrivateDnsActive;
    private final String mPrivateDnsServerName;
    private final String mSearchDomains;

    public DnsStatus(List<InetAddress> list, boolean z, String str, String str2) {
        this.mDnsServers = list;
        this.mPrivateDnsActive = z;
        this.mPrivateDnsServerName = str == null ? "" : str;
        this.mSearchDomains = str2 == null ? "" : str2;
    }

    public byte[][] getDnsServers() {
        byte[][] bArr = new byte[this.mDnsServers.size()][];
        for (int i = 0; i < this.mDnsServers.size(); i++) {
            bArr[i] = this.mDnsServers.get(i).getAddress();
        }
        return bArr;
    }

    public boolean getPrivateDnsActive() {
        return this.mPrivateDnsActive;
    }

    public String getPrivateDnsServerName() {
        return this.mPrivateDnsServerName;
    }

    public String getSearchDomains() {
        return this.mSearchDomains;
    }
}
