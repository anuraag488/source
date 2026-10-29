package p000;

import ads_mobile_sdk.EnumC0192k2;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ia5 implements t20, gg0, hp3, bq3, r94, nj6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21236a;

    /* JADX INFO: renamed from: b */
    public static final ia5 f21211b = new ia5(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ia5 f21212c = new ia5(2);

    /* JADX INFO: renamed from: d */
    public static final nh0 f21213d = new nh0(4);

    /* JADX INFO: renamed from: e */
    public static final jh0 f21214e = new jh0(13);

    /* JADX INFO: renamed from: f */
    public static final jh0 f21215f = new jh0(14);

    /* JADX INFO: renamed from: g */
    public static final jh0 f21216g = new jh0(15);

    /* JADX INFO: renamed from: h */
    public static final jh0 f21217h = new jh0(16);

    /* JADX INFO: renamed from: i */
    public static final dh0 f21218i = new dh0(4);

    /* JADX INFO: renamed from: j */
    public static final ia5 f21219j = new ia5(3);

    /* JADX INFO: renamed from: k */
    public static final ia5 f21220k = new ia5(4);

    /* JADX INFO: renamed from: l */
    public static final ia5 f21221l = new ia5(5);

    /* JADX INFO: renamed from: m */
    public static final ia5 f21222m = new ia5(6);

    /* JADX INFO: renamed from: n */
    public static final ia5 f21223n = new ia5(7);

    /* JADX INFO: renamed from: o */
    public static final ia5 f21224o = new ia5(8);

    /* JADX INFO: renamed from: p */
    public static final ia5 f21225p = new ia5(9);

    /* JADX INFO: renamed from: q */
    public static final ia5 f21226q = new ia5(10);

    /* JADX INFO: renamed from: r */
    public static final ia5 f21227r = new ia5(11);

    /* JADX INFO: renamed from: s */
    public static final ia5 f21228s = new ia5(12);

    /* JADX INFO: renamed from: t */
    public static final ia5 f21229t = new ia5(13);

    /* JADX INFO: renamed from: u */
    public static final ia5 f21230u = new ia5(14);

    /* JADX INFO: renamed from: v */
    public static final j15 f21231v = new j15();

    /* JADX INFO: renamed from: w */
    public static final ia5 f21232w = new ia5(17);

    /* JADX INFO: renamed from: x */
    public static final ia5 f21233x = new ia5(18);

    /* JADX INFO: renamed from: y */
    public static final ia5 f21234y = new ia5(19);

    /* JADX INFO: renamed from: z */
    public static final ia5 f21235z = new ia5(20);

    /* JADX INFO: renamed from: A */
    public static final ia5 f21205A = new ia5(21);

    /* JADX INFO: renamed from: B */
    public static final ia5 f21206B = new ia5(22);

    /* JADX INFO: renamed from: C */
    public static final ia5 f21207C = new ia5(23);

    /* JADX INFO: renamed from: D */
    public static final ia5 f21208D = new ia5(24);

    /* JADX INFO: renamed from: E */
    public static final ia5 f21209E = new ia5(25);

    /* JADX INFO: renamed from: F */
    public static final ia5 f21210F = new ia5(26);

    public /* synthetic */ ia5(byte b) {
        this.f21236a = b;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0192k2 m6709a(int i) throws Exception {
        EnumC0192k2 enumC0192k2 = (EnumC0192k2) EnumC0192k2.f6037c.get(Integer.valueOf(i));
        if (enumC0192k2 != null) {
            return enumC0192k2;
        }
        throw new Exception("Invalid for value enum " + ia5.class.getName() + ": " + i);
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m6710f(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = v71.f32439a;
        }
        ArrayList arrayListM6297I0 = hb0.m6297I0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListM6297I0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM6297I0.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ib0.m6717y0(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            C0921mt c0921mt = new C0921mt();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                xy4.m12782k("Null processName");
                return null;
            }
            c0921mt.f25181a = str2;
            c0921mt.f25182b = runningAppProcessInfo.pid;
            byte b = (byte) (c0921mt.f25185e | 1);
            c0921mt.f25183c = runningAppProcessInfo.importance;
            c0921mt.f25185e = (byte) (b | 2);
            c0921mt.f25184d = z62.m13387o(str2, str);
            c0921mt.f25185e = (byte) (c0921mt.f25185e | 4);
            arrayList2.add(c0921mt.m8390a());
        }
        return arrayList2;
    }

    @Override // p000.nj6
    /* JADX INFO: renamed from: b */
    public boolean mo6711b(Class cls) {
        return zh6.class.isAssignableFrom(cls);
    }

    @Override // p000.nj6
    /* JADX INFO: renamed from: c */
    public ek6 mo6712c(Class cls) {
        if (!zh6.class.isAssignableFrom(cls)) {
            C1077qn.m9987m("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (ek6) zh6.m13561j(cls.asSubclass(zh6.class)).mo97n(3);
        } catch (Exception e) {
            xy4.m12785n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p000.r94
    /* JADX INFO: renamed from: d */
    public boolean mo6713d(Object obj, Object obj2) {
        return z62.m13387o(obj, obj2);
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        return qs5.m10119x((Executor) c0602e8.mo4023g(new ni3(InterfaceC0703gw.class, Executor.class)));
    }

    /* JADX INFO: renamed from: g */
    public ou4 m6714g(Object obj) {
        vr1 vr1Var = (vr1) obj;
        ou4 ou4Var = vr1Var.unknownFields;
        if (ou4Var != ou4.f27126f) {
            return ou4Var;
        }
        ou4 ou4Var2 = new ou4(0, new int[8], new Object[8], true);
        vr1Var.unknownFields = ou4Var2;
        return ou4Var2;
    }

    /* JADX INFO: renamed from: h */
    public iq0 m6715h(Context context) {
        Object obj;
        String processName;
        int iMyPid = Process.myPid();
        ArrayList arrayListM6710f = m6710f(context);
        int size = arrayListM6710f.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListM6710f.get(i);
            i++;
        } while (((C0958nt) ((iq0) obj)).f26073b != iMyPid);
        iq0 iq0Var = (iq0) obj;
        if (iq0Var != null) {
            return iq0Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        C0921mt c0921mt = new C0921mt();
        c0921mt.f25181a = processName;
        c0921mt.f25182b = iMyPid;
        byte b = (byte) (c0921mt.f25185e | 1);
        c0921mt.f25183c = 0;
        c0921mt.f25184d = false;
        c0921mt.f25185e = (byte) (((byte) (b | 2)) | 4);
        return c0921mt.m8390a();
    }

    /* JADX INFO: renamed from: i */
    public boolean m6716i(int i, xa0 xa0Var, Object obj) throws i72 {
        wa0 wa0Var = (wa0) xa0Var.f34095e;
        int i2 = xa0Var.f34092b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            xa0Var.m12593W(0);
            ((ou4) obj).m9282c(i3 << 3, Long.valueOf(wa0Var.mo11329n()));
            return true;
        }
        if (i4 == 1) {
            xa0Var.m12593W(1);
            ((ou4) obj).m9282c((i3 << 3) | 1, Long.valueOf(wa0Var.mo11326k()));
            return true;
        }
        if (i4 == 2) {
            ((ou4) obj).m9282c((i3 << 3) | 2, xa0Var.m12616m());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new i72("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw i72.m6684b();
            }
            xa0Var.m12593W(5);
            ((ou4) obj).m9282c(5 | (i3 << 3), Integer.valueOf(wa0Var.mo11325j()));
            return true;
        }
        ou4 ou4Var = new ou4(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new i72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (xa0Var.m12598d() != Integer.MAX_VALUE && m6716i(i7, xa0Var, ou4Var)) {
        }
        if (i6 != xa0Var.f34092b) {
            throw new i72("Protocol message end-group tag did not match expected tag.");
        }
        if (ou4Var.f27131e) {
            ou4Var.f27131e = false;
        }
        ((ou4) obj).m9282c(i5 | 3, ou4Var);
        return true;
    }

    public String toString() {
        switch (this.f21236a) {
            case 14:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
