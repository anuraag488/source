package p000;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class p25 {

    /* JADX INFO: renamed from: a */
    public static final Method f27327a;

    /* JADX INFO: renamed from: b */
    public static final Method f27328b;

    /* JADX INFO: renamed from: c */
    public static final Method f27329c;

    /* JADX INFO: renamed from: d */
    public static final Method f27330d;

    static {
        Method method;
        Method method2;
        Method method3;
        Class cls = Integer.TYPE;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f27327a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f27328b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f27329c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            method4.setAccessible(true);
        } catch (Exception unused6) {
        }
        f27330d = method4;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9358a(WorkSource workSource) {
        int iIntValue;
        Method method = f27330d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                y42.m12854a0(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        Method method2 = f27329c;
        if (method2 != null) {
            try {
                Object objInvoke2 = method2.invoke(workSource, null);
                y42.m12854a0(objInvoke2);
                iIntValue = ((Integer) objInvoke2).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        return iIntValue == 0;
    }
}
