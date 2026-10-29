package p000;

import ads_mobile_sdk.C0313rh;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zu5 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public InterfaceC1052pz f36393a;

    /* JADX INFO: renamed from: b */
    public tt5 f36394b;

    /* JADX INFO: renamed from: c */
    public tt5 f36395c;

    /* JADX INFO: renamed from: d */
    public int f36396d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C0927mz f36397e;

    /* JADX INFO: renamed from: a */
    public final Long m13796a(boolean z) {
        C0927mz c0927mz = this.f36397e;
        try {
            if (z) {
                synchronized (c0927mz.f25313a) {
                    try {
                        tt5 tt5Var = this.f36394b;
                        if (!tt5Var.f31433b) {
                            return null;
                        }
                        long jM6930a = tt5Var.f31432a.m6930a();
                        if (!tt5Var.f31433b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        tt5Var.f31433b = false;
                        long j = (jM6930a - tt5Var.f31435d) + tt5Var.f31434c;
                        tt5Var.f31434c = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (c0927mz.f25313a) {
                try {
                    tt5 tt5Var2 = this.f36395c;
                    if (!tt5Var2.f31433b) {
                        return null;
                    }
                    long jM6930a2 = tt5Var2.f31432a.m6930a();
                    if (!tt5Var2.f31433b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    tt5Var2.f31433b = false;
                    long j2 = (jM6930a2 - tt5Var2.f31435d) + tt5Var2.f31434c;
                    tt5Var2.f31434c = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qv5.m10141i("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
        qv5.m10141i("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m13797b(f00 f00Var, int i, String str, boolean z, int i2) {
        C0927mz c0927mz = this.f36397e;
        try {
            id6 id6VarM9048r = od6.m9048r();
            int i3 = f00Var.f18622a;
            id6VarM9048r.m8971b();
            od6.m9047q((od6) id6VarM9048r.f26373b, i3);
            String str2 = f00Var.f18624c;
            id6VarM9048r.m8971b();
            od6.m9050t((od6) id6VarM9048r.f26373b, str2);
            id6VarM9048r.m8971b();
            od6.m9053w((od6) id6VarM9048r.f26373b, i);
            id6VarM9048r.m8971b();
            od6.m9051u((od6) id6VarM9048r.f26373b, i2);
            if (str != null) {
                id6VarM9048r.m8971b();
                od6.m9049s((od6) id6VarM9048r.f26373b, str);
            }
            Long lM13796a = m13796a(z);
            if (!z) {
                gg6 gg6VarM7516q = kg6.m7516q();
                gg6VarM7516q.m8971b();
                kg6.m7517r((kg6) gg6VarM7516q.f26373b, (od6) id6VarM9048r.m8970a());
                if (lM13796a != null) {
                    long jLongValue = lM13796a.longValue();
                    gg6VarM7516q.m8971b();
                    kg6.m7518s((kg6) gg6VarM7516q.f26373b, jLongValue);
                }
                c0927mz.f25320h.m9601A((kg6) gg6VarM7516q.m8970a());
                return;
            }
            sg6 sg6VarM11892q = vg6.m11892q();
            int i4 = this.f36396d;
            sg6VarM11892q.m10749c(i4 > 0);
            sg6VarM11892q.m10750d(i4);
            sg6VarM11892q.m8971b();
            vg6.m11896u((vg6) sg6VarM11892q.f26373b, i2);
            if (lM13796a != null) {
                long jLongValue2 = lM13796a.longValue();
                sg6VarM11892q.m8971b();
                vg6.m11895t((vg6) sg6VarM11892q.f26373b, jLongValue2);
            }
            uc6 uc6VarM13092t = yc6.m13092t();
            uc6VarM13092t.m11533c(id6VarM9048r);
            uc6VarM13092t.m8971b();
            yc6.m13091s((yc6) uc6VarM13092t.f26373b, 6);
            uc6VarM13092t.m11534d(sg6VarM11892q);
            c0927mz.m8432A((yc6) uc6VarM13092t.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13798c(int i, boolean z) {
        C0927mz c0927mz = this.f36397e;
        try {
            Long lM13796a = m13796a(z);
            if (!z) {
                gg6 gg6VarM7516q = kg6.m7516q();
                id6 id6VarM9048r = od6.m9048r();
                id6VarM9048r.m8971b();
                od6.m9047q((od6) id6VarM9048r.f26373b, 0);
                id6VarM9048r.m8971b();
                od6.m9051u((od6) id6VarM9048r.f26373b, i);
                gg6VarM7516q.m8971b();
                kg6.m7517r((kg6) gg6VarM7516q.f26373b, (od6) id6VarM9048r.m8970a());
                if (lM13796a != null) {
                    long jLongValue = lM13796a.longValue();
                    gg6VarM7516q.m8971b();
                    kg6.m7518s((kg6) gg6VarM7516q.f26373b, jLongValue);
                }
                c0927mz.f25320h.m9601A((kg6) gg6VarM7516q.m8970a());
                return;
            }
            bd6 bd6VarM5694r = fd6.m5694r();
            bd6VarM5694r.m8971b();
            fd6.m5693q((fd6) bd6VarM5694r.f26373b, 6);
            sg6 sg6VarM11892q = vg6.m11892q();
            int i2 = this.f36396d;
            sg6VarM11892q.m10749c(i2 > 0);
            sg6VarM11892q.m10750d(i2);
            sg6VarM11892q.m8971b();
            vg6.m11896u((vg6) sg6VarM11892q.f26373b, i);
            if (lM13796a != null) {
                long jLongValue2 = lM13796a.longValue();
                sg6VarM11892q.m8971b();
                vg6.m11895t((vg6) sg6VarM11892q.f26373b, jLongValue2);
            }
            bd6VarM5694r.m8971b();
            fd6.m5697v((fd6) bd6VarM5694r.f26373b, (vg6) sg6VarM11892q.m8970a());
            c0927mz.m8433B((fd6) bd6VarM5694r.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13799d(f00 f00Var) {
        C0927mz c0927mz = this.f36397e;
        synchronized (c0927mz.f25313a) {
            try {
                if (c0927mz.f25314b == 3) {
                    return;
                }
                try {
                    this.f36393a.mo7233a(f00Var);
                } catch (Throwable th) {
                    qv5.m10141i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13800e(Exception exc, boolean z, int i) {
        int i2;
        qv5.m10141i("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            i2 = 132;
        } else if (exc instanceof RemoteException) {
            i2 = 134;
        } else {
            i2 = exc instanceof SecurityException ? 133 : 131;
        }
        int i3 = i2;
        String strM7756a = kz5.m7756a(exc);
        this.f36397e.m8435D(0);
        m13797b(z2 ? rz5.f29767j : rz5.f29765h, i3, strM7756a, z, i);
        m13799d(z2 ? rz5.f29767j : rz5.f29765h);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX INFO: renamed from: f */
    public final void m13801f(Exception exc, boolean z) {
        int i;
        int i2;
        String strM7756a;
        f00 f00Var;
        f00 f00Var2;
        qv5.m10141i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            i2 = 91;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    i2 = 92;
                } else {
                    i = 42;
                }
                if (d55.m4358c(i, 42)) {
                    strM7756a = kz5.m7756a(exc);
                } else {
                    strM7756a = null;
                }
                String str = strM7756a;
                this.f36397e.m8435D(0);
                if (z2) {
                    f00Var = rz5.f29767j;
                } else {
                    f00Var = rz5.f29765h;
                }
                m13797b(f00Var, i, str, z, 0);
                if (z2) {
                    f00Var2 = rz5.f29767j;
                } else {
                    f00Var2 = rz5.f29765h;
                }
                m13799d(f00Var2);
            }
            i2 = 90;
        }
        i = i2;
        if (d55.m4358c(i, 42)) {
            strM7756a = kz5.m7756a(exc);
        } else {
            strM7756a = null;
        }
        String str2 = strM7756a;
        this.f36397e.m8435D(0);
        if (z2) {
            f00Var = rz5.f29767j;
        } else {
            f00Var = rz5.f29765h;
        }
        m13797b(f00Var, i, str2, z, 0);
        if (z2) {
            f00Var2 = rz5.f29767j;
        } else {
            f00Var2 = rz5.f29765h;
        }
        m13799d(f00Var2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        qv5.m10140h("BillingClient", "Billing service died.");
        try {
            C0927mz c0927mz = this.f36397e;
            synchronized (c0927mz.f25313a) {
                z = true;
                z2 = c0927mz.f25314b == 1;
            }
            pq3 pq3Var = c0927mz.f25320h;
            if (z2) {
                uc6 uc6VarM13092t = yc6.m13092t();
                uc6VarM13092t.m8971b();
                yc6.m13091s((yc6) uc6VarM13092t.f26373b, 6);
                id6 id6VarM9048r = od6.m9048r();
                id6VarM9048r.m8971b();
                od6.m9053w((od6) id6VarM9048r.f26373b, C0313rh.f10799k1);
                uc6VarM13092t.m11533c(id6VarM9048r);
                sg6 sg6VarM11892q = vg6.m11892q();
                int i = this.f36396d;
                if (i <= 0) {
                    z = false;
                }
                sg6VarM11892q.m10749c(z);
                sg6VarM11892q.m10750d(i);
                uc6VarM13092t.m11534d(sg6VarM11892q);
                pq3Var.m9620s((yc6) uc6VarM13092t.m8970a());
            } else {
                pq3Var.m9625x(sd6.m10689q());
            }
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
        C0927mz c0927mz2 = this.f36397e;
        synchronized (c0927mz2.f25313a) {
            if (c0927mz2.f25314b != 3 && c0927mz2.f25314b != 0) {
                c0927mz2.m8435D(0);
                c0927mz2.m8437F();
                try {
                    this.f36393a.mo7234b();
                } catch (Throwable th2) {
                    qv5.m10141i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        nq5 eq5Var;
        qv5.m10139g("BillingClient", "Billing service connected.");
        C0927mz c0927mz = this.f36397e;
        synchronized (c0927mz.f25313a) {
            try {
                if (c0927mz.f25314b == 3) {
                    return;
                }
                int i = jq5.f22528j;
                if (iBinder == null) {
                    eq5Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    eq5Var = iInterfaceQueryLocalInterface instanceof nq5 ? (nq5) iInterfaceQueryLocalInterface : new eq5(iBinder, "com.android.vending.billing.IInAppBillingService", (byte) 5);
                }
                c0927mz.f25321i = eq5Var;
                tu5 tu5Var = new tu5((byte) 0);
                tu5Var.f31462b = this;
                VarHandle.storeStoreFence();
                RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 18);
                runnableC1029pc.f27515b = this;
                VarHandle.storeStoreFence();
                if (C0927mz.m8427h(tu5Var, 30000L, runnableC1029pc, c0927mz.m8442i(), c0927mz.m8441g()) == null) {
                    int i2 = this.f36396d;
                    f00 f00VarM8445l = c0927mz.m8445l();
                    c0927mz.m8434C(25, i2, f00VarM8445l);
                    m13799d(f00VarM8445l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        qv5.m10140h("BillingClient", "Billing service disconnected.");
        try {
            C0927mz c0927mz = this.f36397e;
            synchronized (c0927mz.f25313a) {
                z = true;
                z2 = c0927mz.f25314b == 1;
            }
            pq3 pq3Var = c0927mz.f25320h;
            if (z2) {
                uc6 uc6VarM13092t = yc6.m13092t();
                uc6VarM13092t.m8971b();
                yc6.m13091s((yc6) uc6VarM13092t.f26373b, 6);
                id6 id6VarM9048r = od6.m9048r();
                id6VarM9048r.m8971b();
                od6.m9053w((od6) id6VarM9048r.f26373b, C0313rh.f10796j1);
                uc6VarM13092t.m11533c(id6VarM9048r);
                sg6 sg6VarM11892q = vg6.m11892q();
                int i = this.f36396d;
                if (i <= 0) {
                    z = false;
                }
                sg6VarM11892q.m10749c(z);
                sg6VarM11892q.m10750d(i);
                uc6VarM13092t.m11534d(sg6VarM11892q);
                pq3Var.m9620s((yc6) uc6VarM13092t.m8970a());
            } else {
                pq3Var.m9602B(qg6.m9883q());
            }
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
        C0927mz c0927mz2 = this.f36397e;
        synchronized (c0927mz2.f25313a) {
            try {
                if (g06.f19480d) {
                    if (c0927mz2.f25314b != 3 && c0927mz2.f25314b != 0) {
                        tt5 tt5Var = this.f36395c;
                        tt5Var.f31434c = 0L;
                        tt5Var.f31433b = false;
                        tt5Var.m11159a();
                    }
                    return;
                }
                tt5 tt5Var2 = this.f36395c;
                tt5Var2.f31434c = 0L;
                tt5Var2.f31433b = false;
                tt5Var2.m11159a();
                if (c0927mz2.f25314b == 3) {
                    return;
                }
                c0927mz2.m8435D(0);
                try {
                    this.f36393a.mo7234b();
                } catch (Throwable th2) {
                    qv5.m10141i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
