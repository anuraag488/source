package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rr5 implements ov4, dr6, j16, w33, ha6, bl0, bn6, nj6, k76, up6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29554a;

    /* JADX INFO: renamed from: b */
    public Object f29555b;

    public /* synthetic */ rr5(byte b) {
        this.f29554a = b;
    }

    @Override // p000.bn6
    /* JADX INFO: renamed from: a */
    public void mo3640a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        mg6 mg6Var = (mg6) this.f29555b;
        if (!zIsEmpty) {
            C1077qn.m9989o("Unexpected call on client side");
        } else {
            ((oa6) mg6Var.f36084a).f26519k.getClass();
            mg6Var.m8321z("auto", "_err", bundle, true, true, System.currentTimeMillis());
        }
    }

    @Override // p000.up6
    /* JADX INFO: renamed from: b */
    public bq6 mo10415b(Class cls) {
        for (int i = 0; i < 2; i++) {
            up6 up6Var = ((up6[]) this.f29555b)[i];
            if (up6Var.mo10416c(cls)) {
                return up6Var.mo10415b(cls);
            }
        }
        qm5.m9919j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p000.nj6
    /* JADX INFO: renamed from: c */
    public ek6 mo6712c(Class cls) {
        for (int i = 0; i < 2; i++) {
            nj6 nj6Var = ((nj6[]) this.f29555b)[i];
            if (nj6Var.mo6711b(cls)) {
                return nj6Var.mo6712c(cls);
            }
        }
        qm5.m9919j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p000.ov4
    /* JADX INFO: renamed from: d */
    public void mo4677d(C0641f8 c0641f8) {
        ((C0714h6) this.f29555b).mo3042a(c0641f8);
    }

    @Override // p000.k76
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo7423e(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((qm6) this.f29555b).m9982z(str, i, th, bArr, map);
    }

    @Override // p000.j16
    /* JADX INFO: renamed from: f */
    public void mo3680f() {
        Network network;
        HttpURLConnection httpURLConnection;
        switch (this.f29554a) {
            case 4:
                zx5 zx5Var = (zx5) this.f29555b;
                zx5Var.f36452d.read(zx5Var, zx5Var.f36453e);
                RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 20);
                runnableC1029pc.f27515b = zx5Var;
                VarHandle.storeStoreFence();
                zx5Var.f36451c.execute(runnableC1029pc);
                return;
            case 5:
                i16 i16Var = (i16) this.f29555b;
                if (i16Var.f21022f.get() == 8) {
                    return;
                }
                URL url = new URL(i16Var.f21029m);
                HttpURLConnection httpURLConnection2 = i16Var.f21033q;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    i16Var.f21033q = null;
                }
                long j = i16Var.f21038v;
                if (j == -1) {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    i16Var.f21033q = httpURLConnection;
                } else {
                    Network[] allNetworks = ((ConnectivityManager) i16Var.f21035s.f15872g.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            network = allNetworks[i];
                            if (network.getNetworkHandle() != j) {
                                i++;
                            }
                        } else {
                            network = null;
                        }
                    }
                    if (network == null) {
                        u16 u16Var = new u16("Network bound to request not found", null);
                        u16Var.f31606a = (byte) 9;
                        u16Var.f31607b = -4;
                        VarHandle.storeStoreFence();
                        throw u16Var;
                    }
                    httpURLConnection = (HttpURLConnection) network.openConnection(url);
                    i16Var.f21033q = httpURLConnection;
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                TreeMap treeMap = i16Var.f21020d;
                if (!treeMap.containsKey("User-Agent")) {
                    treeMap.put("User-Agent", i16Var.f21019c);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    i16Var.f21033q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                i16Var.f21033q.setRequestMethod(i16Var.f21025i);
                cr5 cr5Var = i16Var.f21026j;
                if (cr5Var == null) {
                    i16Var.f21028l = 10;
                    i16Var.f21033q.connect();
                    i16Var.f21028l = 13;
                    bt5 bt5Var = new bt5((byte) 4);
                    bt5Var.f15596b = i16Var;
                    VarHandle.storeStoreFence();
                    i16Var.m6558c(new oz5(i16Var, bt5Var), "fireGetHeaders");
                    return;
                }
                u06 u06Var = new u06(i16Var, i16Var.f21027k, i16Var.f21018b, i16Var.f21033q, cr5Var);
                i16Var.f21034r = u06Var;
                boolean z = i16Var.f21021e.size() == 1;
                li0 li0Var = new li0((byte) 5);
                li0Var.f24044c = u06Var;
                li0Var.f24043b = z;
                VarHandle.storeStoreFence();
                u06Var.m13836c(li0Var, "start");
                return;
            default:
                vk6 vk6Var = (vk6) this.f29555b;
                vk6Var.mo5038t();
                oa6 oa6Var = (oa6) vk6Var.f36084a;
                s86 s86Var = oa6Var.f26513e;
                oa6.m9014j(s86Var);
                oa6Var.f26519k.getClass();
                if (s86Var.m10559E(System.currentTimeMillis())) {
                    s86 s86Var2 = oa6Var.f26513e;
                    oa6.m9014j(s86Var2);
                    s86Var2.f29994p.m6281b(true);
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16831L.m12504a("Detected application was in foreground");
                        m10418h(System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10417g(long j) {
        vk6 vk6Var = (vk6) this.f29555b;
        vk6Var.mo5038t();
        vk6Var.m11924y();
        oa6 oa6Var = (oa6) vk6Var.f36084a;
        s86 s86Var = oa6Var.f26513e;
        oa6.m9014j(s86Var);
        if (s86Var.m10559E(j)) {
            oa6.m9014j(s86Var);
            s86Var.f29994p.m6281b(true);
            oa6Var.m9029p().m4939z();
        }
        oa6.m9014j(s86Var);
        s86Var.f29975N.m8624b(j);
        if (s86Var.f29994p.m6280a()) {
            m10418h(j);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m10418h(long j) {
        vk6 vk6Var = (vk6) this.f29555b;
        vk6Var.mo5038t();
        oa6 oa6Var = (oa6) vk6Var.f36084a;
        if (oa6Var.m9018a()) {
            s86 s86Var = oa6Var.f26513e;
            oa6.m9014j(s86Var);
            s86Var.f29975N.m8624b(j);
            oa6Var.f26519k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long lValueOf = Long.valueOf(j2);
            mg6 mg6Var = oa6Var.f26521m;
            oa6.m9015k(mg6Var);
            mg6Var.m8306G(j, lValueOf, "auto", "_sid");
            oa6.m9014j(s86Var);
            s86Var.f29976O.m8624b(j2);
            s86Var.f29994p.m6281b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            oa6.m9015k(mg6Var);
            mg6Var.m8302C("auto", "_s", bundle, j);
            String strM10506c = s86Var.f29981T.m10506c();
            if (TextUtils.isEmpty(strM10506c)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM10506c);
            oa6.m9015k(mg6Var);
            mg6Var.m8302C("auto", "_ssr", bundle2, j);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m10419i(int i, Object obj, kq6 kq6Var) {
        in6 in6Var = (in6) this.f29555b;
        hm6 hm6Var = (hm6) obj;
        in6Var.m6843w(i, 2);
        in6Var.m6845y(hm6Var.mo6450c(kq6Var));
        kq6Var.mo7583f(hm6Var, this);
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public Object mo4146j() {
        switch (this.f29554a) {
            case 2:
                yq0 yq0Var = ky5.f23627b;
                g06.m5881a(yq0Var);
                wd3 wd3Var = (wd3) this.f29555b;
                gu5 gu5Var = new gu5();
                gu5Var.f20143c = new AtomicReference();
                gu5Var.f20144d = new AtomicReference();
                gu5Var.f20141a = wd3Var;
                gu5Var.f20142b = yq0Var;
                VarHandle.storeStoreFence();
                return gu5Var;
            case 3:
                return new wu5((Application) ((C1392z4) this.f29555b).f35744a);
            default:
                cr6 cr6Var = (cr6) this.f29555b;
                if (cr6Var != null) {
                    return cr6Var.mo4146j();
                }
                xy4.m12787p();
                return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10420k(int i, Object obj, na6 na6Var) {
        n83 n83Var = (n83) this.f29555b;
        u36 u36Var = (u36) obj;
        n83Var.m8619w(i, 2);
        n83Var.m8621y(u36Var.mo10537c(na6Var));
        na6Var.mo8660g(u36Var, this);
    }

    @Override // p000.bl0
    /* JADX INFO: renamed from: l */
    public void mo3614l(C0641f8 c0641f8) {
        dc6 dc6Var = (dc6) this.f29555b;
        synchronized (dc6Var.f16988e) {
            dc6Var.f16991h = false;
        }
    }

    @Override // p000.w33
    public /* synthetic */ void onComplete(nr6 nr6Var) {
        if (nr6Var.m8826j()) {
            return;
        }
        li4 li4Var = (li4) this.f29555b;
        Exception excM8823g = nr6Var.m8823g();
        Objects.requireNonNull(excM8823g);
        li4Var.m7989b(excM8823g);
    }

    @Override // p000.nj6
    /* JADX INFO: renamed from: b */
    public boolean mo6711b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((nj6[]) this.f29555b)[i].mo6711b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.up6
    /* JADX INFO: renamed from: c */
    public boolean mo10416c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((up6[]) this.f29555b)[i].mo10416c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ha6
    /* JADX INFO: renamed from: f */
    public FileChannel mo3679f() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f29555b;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        C1077qn.m9987m("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
        return null;
    }
}
