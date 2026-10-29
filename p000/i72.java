package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class i72 extends IOException {

    /* JADX INFO: renamed from: a */
    public boolean f21153a;

    /* JADX INFO: renamed from: a */
    public static i72 m6683a() {
        return new i72("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static g72 m6684b() {
        return new g72("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static i72 m6685c() {
        return new i72("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static i72 m6686d() {
        return new i72("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static i72 m6687e() {
        return new i72("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
