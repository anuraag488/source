package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f28726c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d */
    public static final Pattern f28727d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public String f28728a;

    /* JADX INFO: renamed from: b */
    public String[] f28729b;

    public final boolean equals(Object obj) {
        return (obj instanceof qr2) && z62.m13387o(((qr2) obj).f28728a, this.f28728a);
    }

    public final int hashCode() {
        return this.f28728a.hashCode();
    }

    public final String toString() {
        return this.f28728a;
    }
}
