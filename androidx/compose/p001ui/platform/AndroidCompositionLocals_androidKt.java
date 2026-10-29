package androidx.compose.p001ui.platform;

import p000.C0515c5;
import p000.C0891m;
import p000.as4;
import p000.kj0;
import p000.nc4;
import p000.xh3;
import p000.xm2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a */
    public static final kj0 f14650a = as4.m3262u(new C0515c5((byte) 2));

    /* JADX INFO: renamed from: b */
    public static final nc4 f14651b = new nc4(new C0515c5((byte) 3));

    /* JADX INFO: renamed from: c */
    public static final kj0 f14652c = as4.m3263v(new C0891m(13));

    /* JADX INFO: renamed from: d */
    public static final nc4 f14653d = new nc4(new C0515c5((byte) 4));

    /* JADX INFO: renamed from: e */
    public static final nc4 f14654e = new nc4(new C0515c5((byte) 5));

    /* JADX INFO: renamed from: f */
    public static final nc4 f14655f = new nc4(new C0515c5((byte) 6));

    /* JADX INFO: renamed from: a */
    public static final void m3054a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final xh3 getLocalSavedStateRegistryOwner() {
        return xm2.f34419a;
    }
}
