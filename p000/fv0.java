package p000;

import ads_mobile_sdk.C0197ka;
import ads_mobile_sdk.EnumC0165io;
import ads_mobile_sdk.dy2;
import ads_mobile_sdk.l01;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 implements InterfaceC1221uj, InterfaceC1124rx, InterfaceC1161sx {

    /* JADX INFO: renamed from: a */
    public long f19330a;

    /* JADX INFO: renamed from: b */
    public Object f19331b;

    /* JADX INFO: renamed from: c */
    public Object f19332c;

    /* JADX INFO: renamed from: d */
    public Object f19333d;

    /* JADX INFO: renamed from: e */
    public Object f19334e;

    /* JADX INFO: renamed from: f */
    public Object f19335f;

    /* JADX INFO: renamed from: g */
    public Object f19336g;

    /* JADX INFO: renamed from: h */
    public Object f19337h;

    public fv0(Context context, EnumC0165io enumC0165io, String str, String str2, C0197ka c0197ka) {
        this.f19332c = str;
        this.f19334e = enumC0165io;
        this.f19333d = str2;
        this.f19337h = c0197ka;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f19336g = handlerThread;
        handlerThread.start();
        this.f19330a = System.currentTimeMillis();
        l01 l01Var = new l01(19621000, this, this, context, handlerThread.getLooper());
        this.f19331b = l01Var;
        this.f19335f = new LinkedBlockingQueue();
        l01Var.checkAvailabilityAndConnect();
    }

    /* JADX INFO: renamed from: a */
    public void m5811a(int i, long j, Exception exc) {
        C0197ka c0197ka = (C0197ka) this.f19337h;
        if (c0197ka != null) {
            c0197ka.m1478a(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: b */
    public Object mo5813b(long j) {
        if (m11569g(j)) {
            return this.f19334e;
        }
        yp1 yp1Var = ((sq4) this.f19332c).f30509b;
        cx4 cx4Var = (cx4) this.f19331b;
        AbstractC0654fk abstractC0654fk = (AbstractC0654fk) this.f19335f;
        AbstractC0654fk abstractC0654fk2 = (AbstractC0654fk) this.f19336g;
        AbstractC0654fk abstractC0654fkMo4035c = cx4Var.f16582b;
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = abstractC0654fk.mo4035c();
            cx4Var.f16582b = abstractC0654fkMo4035c;
        }
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        int i = 0;
        while (true) {
            AbstractC0654fk abstractC0654fk3 = cx4Var.f16582b;
            if (i >= iMo4034b) {
                if (abstractC0654fk3 != null) {
                    return yp1Var.invoke(abstractC0654fk3);
                }
                z62.m13366Y("valueVector");
                throw null;
            }
            if (abstractC0654fk3 == null) {
                z62.m13366Y("valueVector");
                throw null;
            }
            abstractC0654fk3.mo3610e(cx4Var.f16581a.mo5964l(abstractC0654fk.mo3608a(i), abstractC0654fk2.mo3608a(i), j), i);
            i++;
        }
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: c */
    public long mo5814c() {
        return this.f19330a;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: d */
    public sq4 mo5815d() {
        return (sq4) this.f19332c;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: e */
    public Object mo5816e() {
        return this.f19334e;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: f */
    public AbstractC0654fk mo5817f(long j) {
        return !m11569g(j) ? ((cx4) this.f19331b).m4227a(j, (AbstractC0654fk) this.f19335f, (AbstractC0654fk) this.f19336g) : (AbstractC0654fk) this.f19337h;
    }

    @Override // p000.InterfaceC1124rx
    public void onConnected() {
        lg5 lg5Var;
        HandlerThread handlerThread = (HandlerThread) this.f19336g;
        long j = this.f19330a;
        l01 l01Var = (l01) this.f19331b;
        try {
            lg5Var = (lg5) l01Var.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            lg5Var = null;
        }
        if (lg5Var != null) {
            try {
                EnumC0165io enumC0165io = (EnumC0165io) this.f19334e;
                String str = (String) this.f19332c;
                String str2 = (String) this.f19333d;
                short s = enumC0165io.f5153a;
                cf5 cf5Var = (cf5) lg5Var;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(cf5Var.f23221c);
                int i = a95.f197a;
                parcelObtain.writeInt(1);
                int iM9092Q = oh6.m9092Q(parcelObtain, 20293);
                oh6.m9091P(parcelObtain, 1, 4);
                parcelObtain.writeInt(1);
                oh6.m9091P(parcelObtain, 2, 4);
                parcelObtain.writeInt(1);
                oh6.m9088M(parcelObtain, 3, str);
                oh6.m9088M(parcelObtain, 4, str2);
                oh6.m9091P(parcelObtain, 5, 4);
                parcelObtain.writeInt(s);
                oh6.m9094S(parcelObtain, iM9092Q);
                Parcel parcelM7557a = cf5Var.m7557a(parcelObtain, 3);
                dy2 dy2VarCreateFromParcel = parcelM7557a.readInt() == 0 ? null : dy2.CREATOR.createFromParcel(parcelM7557a);
                parcelM7557a.recycle();
                m5811a(5011, j, null);
                ((LinkedBlockingQueue) this.f19335f).put(dy2VarCreateFromParcel);
                if (l01Var != null && (l01Var.isConnected() || l01Var.isConnecting())) {
                }
            } catch (Throwable th) {
                try {
                    m5811a(2010, j, new Exception(th));
                } finally {
                    if (l01Var != null && (l01Var.isConnected() || l01Var.isConnecting())) {
                        l01Var.disconnect();
                    }
                    handlerThread.quit();
                }
            }
        }
    }

    @Override // p000.InterfaceC1161sx
    public void onConnectionFailed(lk0 lk0Var) {
        try {
            m5811a(4012, this.f19330a, null);
            ((LinkedBlockingQueue) this.f19335f).put(new dy2(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // p000.InterfaceC1124rx
    public void onConnectionSuspended(int i) {
        try {
            m5811a(4011, this.f19330a, null);
            ((LinkedBlockingQueue) this.f19335f).put(new dy2(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: a */
    public boolean mo5812a() {
        return false;
    }
}
