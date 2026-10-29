package p000;

import android.content.Context;
import android.os.SystemClock;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ot1 {

    /* JADX INFO: renamed from: a */
    public final Context f27076a;

    /* JADX INFO: renamed from: b */
    public final String f27077b;

    /* JADX INFO: renamed from: c */
    public final nh3 f27078c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1037pk f27079d;

    /* JADX INFO: renamed from: e */
    public final C0458al f27080e;

    /* JADX INFO: renamed from: f */
    public final int f27081f;

    /* JADX INFO: renamed from: g */
    public final ig1 f27082g;

    /* JADX INFO: renamed from: h */
    public final tt1 f27083h;

    public ot1(Context context, nh3 nh3Var, InterfaceC1037pk interfaceC1037pk, nt1 nt1Var) {
        y42.m12855b0(context, "Null context is not permitted.");
        y42.m12855b0(nh3Var, "Api must not be null.");
        y42.m12855b0(nt1Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y42.m12855b0(applicationContext, "The provided context did not have an application context.");
        this.f27076a = applicationContext;
        String attributionTag = context.getAttributionTag();
        this.f27077b = attributionTag;
        this.f27078c = nh3Var;
        this.f27079d = interfaceC1037pk;
        C0458al c0458al = new C0458al();
        c0458al.f14605b = nh3Var;
        c0458al.f14606c = interfaceC1037pk;
        c0458al.f14607d = attributionTag;
        c0458al.f14604a = Arrays.hashCode(new Object[]{nh3Var, interfaceC1037pk, attributionTag});
        VarHandle.storeStoreFence();
        this.f27080e = c0458al;
        tt1 tt1VarM11134e = tt1.m11134e(applicationContext);
        this.f27083h = tt1VarM11134e;
        this.f27081f = tt1VarM11134e.f31418h.getAndIncrement();
        this.f27082g = nt1Var.f26080a;
        km5 km5Var = tt1VarM11134e.f31423m;
        km5Var.sendMessage(km5Var.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: b */
    public final C1283w7 m9263b() {
        C1283w7 c1283w7 = new C1283w7((byte) 5);
        c1283w7.f33126b = q64.f28243b;
        VarHandle.storeStoreFence();
        Set set = Collections.EMPTY_SET;
        C0879lo c0879lo = (C0879lo) c1283w7.f33127c;
        if (c0879lo == null) {
            c0879lo = new C0879lo(0);
            c1283w7.f33127c = c0879lo;
        }
        c0879lo.addAll(set);
        Context context = this.f27076a;
        c1283w7.f33129e = context.getClass().getName();
        c1283w7.f33128d = context.getPackageName();
        return c1283w7;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX INFO: renamed from: c */
    public final nr6 m9264c(int i, ki4 ki4Var) {
        nr6 nr6Var;
        ul5 ul5Var;
        li4 li4Var = new li4();
        nr6 nr6Var2 = li4Var.f24059a;
        tt1 tt1Var = this.f27083h;
        km5 km5Var = tt1Var.f31423m;
        short s = ki4Var.f23157c;
        if (s != 0) {
            if (tt1Var.m11135a()) {
                br3 br3Var = (br3) ar3.m3127r().f14813b;
                C0458al c0458al = this.f27080e;
                boolean z = true;
                if (br3Var != null) {
                    if (br3Var.f15525e) {
                        boolean z2 = br3Var.f15526f;
                        ol5 ol5Var = (ol5) tt1Var.f31420j.get(c0458al);
                        if (ol5Var != null) {
                            Object obj = ol5Var.f26857b;
                            if (obj instanceof AbstractC1235ux) {
                                AbstractC1235ux abstractC1235ux = (AbstractC1235ux) obj;
                                if (!abstractC1235ux.hasConnectionInfo() || abstractC1235ux.isConnecting()) {
                                    z = z2;
                                } else {
                                    qk0 qk0VarM11583a = ul5.m11583a(ol5Var, abstractC1235ux, s);
                                    if (qk0VarM11583a != null) {
                                        ol5Var.f26867l++;
                                        z = qk0VarM11583a.f28536f;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    ul5Var = null;
                    nr6Var = null;
                }
                long jCurrentTimeMillis = z ? System.currentTimeMillis() : 0L;
                long jElapsedRealtime = z ? SystemClock.elapsedRealtime() : 0L;
                nr6Var = null;
                ul5Var = new ul5();
                ul5Var.f31974a = tt1Var;
                ul5Var.f31975b = s;
                ul5Var.f31976c = c0458al;
                ul5Var.f31977d = jCurrentTimeMillis;
                ul5Var.f31978e = jElapsedRealtime;
                VarHandle.storeStoreFence();
            } else {
                ul5Var = null;
                nr6Var = null;
            }
            if (ul5Var != null) {
                km5Var.getClass();
                bu3 bu3Var = new bu3((byte) 2);
                bu3Var.f15636b = km5Var;
                VarHandle.storeStoreFence();
                nr6Var2.getClass();
                nr6Var2.f26058b.m10307g(new a86(bu3Var, ul5Var));
                nr6Var2.m8833q();
            }
        } else {
            nr6Var = null;
        }
        dm5 dm5Var = new dm5(i);
        dm5Var.f17194c = li4Var;
        dm5Var.f17193b = ki4Var;
        dm5Var.f17195d = this.f27082g;
        if (i == 2 && ki4Var.f23156b) {
            C1077qn.m9987m("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            return nr6Var;
        }
        VarHandle.storeStoreFence();
        int i2 = tt1Var.f31419i.get();
        wl5 wl5Var = new wl5();
        wl5Var.f33481a = dm5Var;
        wl5Var.f33482b = i2;
        wl5Var.f33483c = this;
        VarHandle.storeStoreFence();
        km5Var.sendMessage(km5Var.obtainMessage(4, wl5Var));
        return nr6Var2;
    }
}
