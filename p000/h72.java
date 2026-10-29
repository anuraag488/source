package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class h72 extends IOException {
    /* JADX INFO: renamed from: a */
    public static h72 m6264a() {
        return new h72("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static f72 m6265b() {
        return new f72("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static h72 m6266c() {
        return new h72("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: d */
    public static h72 m6267d() {
        return new h72("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: e */
    public static h72 m6268e() {
        return new h72("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
