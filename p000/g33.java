package p000;

import java.lang.invoke.VarHandle;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g33 {

    /* JADX INFO: renamed from: A */
    public wd3 f19559A;

    /* JADX INFO: renamed from: a */
    public C1283w7 f19560a = new C1283w7();

    /* JADX INFO: renamed from: b */
    public ar3 f19561b = new ar3(5, 5);

    /* JADX INFO: renamed from: c */
    public final ArrayList f19562c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f19563d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public ds3 f19564e;

    /* JADX INFO: renamed from: f */
    public boolean f19565f;

    /* JADX INFO: renamed from: g */
    public o85 f19566g;

    /* JADX INFO: renamed from: h */
    public boolean f19567h;

    /* JADX INFO: renamed from: i */
    public boolean f19568i;

    /* JADX INFO: renamed from: j */
    public ig1 f19569j;

    /* JADX INFO: renamed from: k */
    public ia5 f19570k;

    /* JADX INFO: renamed from: l */
    public ProxySelector f19571l;

    /* JADX INFO: renamed from: m */
    public o85 f19572m;

    /* JADX INFO: renamed from: n */
    public SocketFactory f19573n;

    /* JADX INFO: renamed from: o */
    public SSLSocketFactory f19574o;

    /* JADX INFO: renamed from: p */
    public X509TrustManager f19575p;

    /* JADX INFO: renamed from: q */
    public List f19576q;

    /* JADX INFO: renamed from: r */
    public List f19577r;

    /* JADX INFO: renamed from: s */
    public HostnameVerifier f19578s;

    /* JADX INFO: renamed from: t */
    public n70 f19579t;

    /* JADX INFO: renamed from: u */
    public n40 f19580u;

    /* JADX INFO: renamed from: v */
    public int f19581v;

    /* JADX INFO: renamed from: w */
    public short f19582w;

    /* JADX INFO: renamed from: x */
    public short f19583x;

    /* JADX INFO: renamed from: y */
    public short f19584y;

    /* JADX INFO: renamed from: z */
    public short f19585z;

    public g33() {
        ds3 ds3Var = new ds3((byte) 28);
        VarHandle.storeStoreFence();
        this.f19564e = ds3Var;
        this.f19565f = true;
        o85 o85Var = o85.f26442b;
        this.f19566g = o85Var;
        this.f19567h = true;
        this.f19568i = true;
        this.f19569j = ig1.f21394r;
        this.f19570k = ia5.f21220k;
        this.f19572m = o85Var;
        this.f19573n = SocketFactory.getDefault();
        this.f19576q = h33.f20310C;
        this.f19577r = h33.f20309B;
        this.f19578s = f33.f18714a;
        this.f19579t = n70.f25486c;
        this.f19582w = (short) 10000;
        this.f19583x = (short) 10000;
        this.f19584y = (short) 10000;
        this.f19585z = (short) 1024;
    }

    /* JADX INFO: renamed from: a */
    public final void m5895a(long j) {
        byte[] bArr = zv4.f36415a;
        if (j < 0) {
            C1077qn.m9989o("timeout < 0");
            return;
        }
        if (j > 2147483647L) {
            C1077qn.m9987m("timeout too large.");
        } else if (j != 0 || j <= 0) {
            this.f19581v = (int) j;
        } else {
            C1077qn.m9987m("timeout too small.");
        }
    }
}
