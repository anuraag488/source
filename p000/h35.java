package p000;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h35 {

    /* JADX INFO: renamed from: a */
    public q25 f20341a;

    /* JADX INFO: renamed from: b */
    public Context f20342b;

    /* JADX INFO: renamed from: c */
    public String f20343c;

    /* JADX INFO: renamed from: d */
    public j25 f20344d;

    /* JADX INFO: renamed from: e */
    public ik0 f20345e;

    /* JADX INFO: renamed from: f */
    public i50 f20346f;

    /* JADX INFO: renamed from: g */
    public WorkDatabase f20347g;

    /* JADX INFO: renamed from: h */
    public u25 f20348h;

    /* JADX INFO: renamed from: i */
    public ry0 f20349i;

    /* JADX INFO: renamed from: j */
    public ArrayList f20350j;

    /* JADX INFO: renamed from: k */
    public String f20351k;

    /* JADX INFO: renamed from: l */
    public v82 f20352l;

    /* JADX INFO: renamed from: m */
    public boolean f20353m;

    /* JADX INFO: renamed from: n */
    public ArrayList f20354n;

    /* JADX INFO: renamed from: o */
    public ArrayList f20355o;

    /* JADX INFO: renamed from: a */
    public final p60 m6210a() {
        so0 so0Var = this.f20344d.f21973b;
        v82 v82VarM13021a = y70.m13021a();
        so0Var.getClass();
        ro0 ro0VarM10089N = qs5.m10089N(so0Var, v82VarM13021a);
        f35 f35Var = new f35(this, null, (byte) 1);
        cp0 cp0Var = cp0.f16325a;
        ck0 ck0Var = new ck0((byte) 4);
        ck0Var.f16074b = ro0VarM10089N;
        ck0Var.f16075c = cp0Var;
        ck0Var.f16076d = f35Var;
        VarHandle.storeStoreFence();
        return AbstractC0647fd.m5686z(ck0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m6211b(am2 am2Var) {
        String str = i35.f21109a;
        wn2.m12326e().m12331f(str, "Worker result FAILURE for " + this.f20351k);
        if (this.f20341a.m9717b()) {
            m6213d();
        } else {
            m6216g(am2Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6212c(int i) {
        u25 u25Var = this.f20348h;
        f25 f25Var = f25.f18681a;
        String str = this.f20343c;
        u25Var.m11214f(f25Var, str);
        this.f20346f.getClass();
        u25Var.m11213e(str, System.currentTimeMillis());
        u25Var.m11212d(this.f20341a.f28183v, str);
        u25Var.m11211c(str, -1L);
        u25Var.m11215g(i, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m6213d() {
        u25 u25Var = this.f20348h;
        String str = this.f20343c;
        this.f20346f.getClass();
        u25Var.m11213e(str, System.currentTimeMillis());
        u25Var.m11214f(f25.f18681a, str);
        WorkDatabase workDatabase = u25Var.f31629a;
        C1051py c1051py = new C1051py((byte) 17);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        ((Number) as4.m3231J(workDatabase, false, true, c1051py)).intValue();
        u25Var.m11212d(this.f20341a.f28183v, str);
        C1051py c1051py2 = new C1051py((byte) 19);
        c1051py2.f28076b = str;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, c1051py2);
        u25Var.m11211c(str, -1L);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6214e(int i) {
        u25 u25Var = this.f20348h;
        String str = this.f20343c;
        q25 q25Var = this.f20341a;
        if (z62.m13387o(q25Var.f28186y, Boolean.TRUE)) {
            String str2 = i35.f21109a;
            wn2.m12326e().m12328b(str2, "Worker " + q25Var.f28164c + " was interrupted. Backing off.");
            m6212c(i);
            return true;
        }
        f25 f25VarM11209a = u25Var.m11209a(str);
        if (f25VarM11209a == null || f25VarM11209a.m5459a()) {
            String str3 = i35.f21109a;
            wn2.m12326e().m12328b(str3, "Status for " + str + " is " + f25VarM11209a + " ; not doing any work");
            return false;
        }
        String str4 = i35.f21109a;
        wn2.m12326e().m12328b(str4, "Status for " + str + " is " + f25VarM11209a + "; not doing any work and rescheduling for later execution");
        u25Var.m11214f(f25.f18681a, str);
        u25Var.m11215g(i, str);
        u25Var.m11211c(str, -1L);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX INFO: renamed from: f */
    public final Object m6215f(ym0 ym0Var) {
        g35 g35Var;
        OverwritingInputMerger overwritingInputMerger;
        zs0 zs0Var;
        String str = this.f20351k;
        String str2 = this.f20343c;
        WorkDatabase workDatabase = this.f20347g;
        ik0 ik0Var = this.f20345e;
        q25 q25Var = this.f20341a;
        if (ym0Var instanceof g35) {
            g35Var = (g35) ym0Var;
            int i = g35Var.f19595v;
            if ((i & Integer.MIN_VALUE) != 0) {
                g35Var.f19595v = i - Integer.MIN_VALUE;
            } else {
                g35Var = new g35(this, ym0Var);
            }
        } else {
            g35Var = new g35(this, ym0Var);
        }
        g35 g35Var2 = g35Var;
        Object objM7921b0 = g35Var2.f19593t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = g35Var2.f19595v;
        try {
            if (i2 == 0) {
                k43.m7376J(objM7921b0);
                ik0Var.f21515l.getClass();
                boolean zIsEnabled = Trace.isEnabled();
                String str3 = q25Var.f28185x;
                String str4 = q25Var.f28164c;
                String str5 = q25Var.f28165d;
                byte b = 0;
                if (zIsEnabled && str3 != null) {
                    r50 r50Var = ik0Var.f21515l;
                    int iHashCode = q25Var.hashCode();
                    r50Var.getClass();
                    Trace.beginAsyncSection(str3.length() <= 127 ? str3 : str3.substring(0, 127), iHashCode);
                }
                z25 z25Var = new z25(b);
                z25Var.f35727b = this;
                VarHandle.storeStoreFence();
                if (((Boolean) workDatabase.m3073p(z25Var)).booleanValue()) {
                    return new d35(true);
                }
                if (q25Var.m9717b()) {
                    zs0Var = q25Var.f28166e;
                } else {
                    ik0Var.f21508e.getClass();
                    String str6 = y32.f34837a;
                    try {
                        overwritingInputMerger = (OverwritingInputMerger) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception e) {
                        wn2.m12326e().m12330d(y32.f34837a, "Trouble instantiating ".concat(str5), e);
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        String str7 = i35.f21109a;
                        wn2.m12326e().m12329c(str7, "Could not create Input Merger " + str5);
                        return new d35(false);
                    }
                    List listSingletonList = Collections.singletonList(q25Var.f28166e);
                    WorkDatabase workDatabase2 = this.f20348h.f31629a;
                    C1051py c1051py = new C1051py((byte) 20);
                    c1051py.f28076b = str2;
                    VarHandle.storeStoreFence();
                    ArrayList arrayListM6310V0 = hb0.m6310V0(listSingletonList, (List) as4.m3231J(workDatabase2, true, false, c1051py));
                    ys0 ys0Var = new ys0();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = arrayListM6310V0.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayListM6310V0.get(i3);
                        i3++;
                        linkedHashMap.putAll(Collections.unmodifiableMap(((zs0) obj).f36339a));
                    }
                    ys0Var.m13231a(linkedHashMap);
                    zs0Var = new zs0(ys0Var.f35491a);
                    C0006a5.m57M(zs0Var);
                }
                UUID.fromString(str2);
                ArrayList arrayList = this.f20350j;
                Executor executor = ik0Var.f21504a;
                d25 d25Var = new d25();
                workDatabase.mo3080w();
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f14684a = zs0Var;
                new HashSet(arrayList);
                workerParameters.f14685b = executor;
                try {
                    Worker workerM6797l = ik0Var.f21507d.m6797l(this.f20342b, str4, workerParameters);
                    workerM6797l.f14683d = true;
                    t82 t82Var = (t82) g35Var2.getContext().get(o85.f26448h);
                    C0453ag c0453ag = new C0453ag((byte) 6);
                    c0453ag.f14444c = workerM6797l;
                    c0453ag.f14443b = zIsEnabled;
                    c0453ag.f14445d = str3;
                    c0453ag.f14446e = this;
                    VarHandle.storeStoreFence();
                    t82Var.mo4972C(c0453ag);
                    z25 z25Var2 = new z25((byte) 1);
                    z25Var2.f35727b = this;
                    VarHandle.storeStoreFence();
                    if (!((Boolean) workDatabase.m3073p(z25Var2)).booleanValue()) {
                        return new d35(true);
                    }
                    if (t82Var.isCancelled()) {
                        return new d35(true);
                    }
                    so0 so0VarM10119x = qs5.m10119x(this.f20344d.f21976e);
                    C1199ty c1199ty = new C1199ty(this, workerM6797l, d25Var, null, (byte) 11);
                    g35Var2.f19595v = 1;
                    objM7921b0 = lb5.m7921b0(so0VarM10119x, c1199ty, g35Var2);
                    if (objM7921b0 == ap0Var) {
                        return ap0Var;
                    }
                } catch (Throwable unused) {
                    String str8 = i35.f21109a;
                    wn2.m12326e().m12329c(str8, "Could not create Worker " + str4);
                    return new d35(false);
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(objM7921b0);
            }
            b35 b35Var = new b35();
            b35Var.f15063a = (cm2) objM7921b0;
            VarHandle.storeStoreFence();
            return b35Var;
        } catch (CancellationException e2) {
            String str9 = i35.f21109a;
            String str10 = str + " was cancelled";
            if (wn2.m12326e().f33518a <= 4) {
                Log.i(str9, str10, e2);
            }
            throw e2;
        } catch (Throwable th) {
            String str11 = i35.f21109a;
            wn2.m12326e().m12330d(str11, str + " failed because it threw an exception/error", th);
            ik0Var.getClass();
            return new a35();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6216g(cm2 cm2Var) {
        String str = this.f20343c;
        u25 u25Var = this.f20348h;
        ArrayList arrayListM7699b0 = kx5.m7699b0(str);
        arrayListM7699b0.addAll(gq6.m6096u(this.f20349i, str));
        int size = arrayListM7699b0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM7699b0.get(i);
            i++;
            String str2 = (String) obj;
            if (u25Var.m11209a(str2) != f25.f18686f) {
                u25Var.m11214f(f25.f18684d, str2);
                if (!str2.equals(str)) {
                    this.f20355o.add(str2);
                }
            }
        }
        zs0 zs0Var = ((am2) cm2Var).f14626a;
        u25Var.m11212d(this.f20341a.f28183v, str);
        WorkDatabase workDatabase = u25Var.f31629a;
        cz3 cz3Var = new cz3((byte) 26);
        cz3Var.f16638b = zs0Var;
        cz3Var.f16639c = str;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, cz3Var);
    }
}
