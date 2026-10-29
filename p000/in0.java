package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class in0 implements pn0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ kn0 f21568a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC0755ia f21569b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f21570c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sn0 f21571d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Set f21572e;

    @Override // p000.pn0
    /* JADX INFO: renamed from: a */
    public final on0 mo6045a() {
        return this.f21568a.mo6045a();
    }

    @Override // p000.pn0
    /* JADX INFO: renamed from: b */
    public final yp1 mo6046b() {
        return new C0792jb(this.f21568a, this.f21572e, null, (byte) 6);
    }

    @Override // p000.pn0
    /* JADX INFO: renamed from: c */
    public final yp1 mo6047c() {
        yp1 yp1VarMo6047c = this.f21568a.mo6047c();
        if (yp1VarMo6047c != null) {
            return new hn0(this.f21569b, yp1VarMo6047c, this.f21570c, this.f21571d, null, (byte) 0);
        }
        return null;
    }

    @Override // p000.pn0
    /* JADX INFO: renamed from: d */
    public final yp1 mo6048d() {
        return this.f21568a.mo6048d();
    }

    @Override // p000.pn0
    public final String getDescription() {
        return this.f21568a.getDescription();
    }

    @Override // p000.pn0
    public final mq1 getIcon() {
        return this.f21568a.getIcon();
    }

    @Override // p000.pn0
    public final String getTitle() {
        return this.f21568a.getTitle();
    }
}
