package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lp0 implements Callable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f24257a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f24258b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Thread f24259c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C1372yl f24260d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ np0 f24261e;

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C1372yl c1372yl = this.f24260d;
        long j = this.f24257a;
        long j2 = j / 1000;
        np0 np0Var = this.f24261e;
        NavigableSet navigableSetM12373c = ((wq0) np0Var.f26005m.f17868b).m12373c();
        String str = !navigableSetM12373c.isEmpty() ? (String) navigableSetM12373c.first() : null;
        String str2 = "FirebaseCrashlytics";
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return y62.m12936B(null);
        }
        np0Var.f25995c.m13326u();
        C0602e8 c0602e8 = np0Var.f26005m;
        Throwable th = this.f24258b;
        Thread thread = this.f24259c;
        String strConcat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        uq0 uq0Var = (uq0) c0602e8.f17867a;
        Context context = uq0Var.f32089a;
        int i = context.getResources().getConfiguration().orientation;
        ys2 ys2Var = uq0Var.f32092d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        C1283w7 c1283w7 = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            Stack stack2 = stack;
            C1372yl c1372yl2 = c1372yl;
            String localizedMessage = th2.getLocalizedMessage();
            String str3 = str2;
            String name = th2.getClass().getName();
            long j3 = j;
            StackTraceElement[] stackTraceElementArrMo8265a = ys2Var.mo8265a(th2.getStackTrace());
            C1283w7 c1283w8 = new C1283w7((byte) 21);
            c1283w8.f33127c = localizedMessage;
            c1283w8.f33128d = name;
            c1283w8.f33129e = stackTraceElementArrMo8265a;
            c1283w8.f33126b = c1283w7;
            VarHandle.storeStoreFence();
            c1283w7 = c1283w8;
            stack = stack2;
            c1372yl = c1372yl2;
            str2 = str3;
            j = j3;
        }
        C1372yl c1372yl3 = c1372yl;
        long j4 = j;
        String str4 = str2;
        C1305ws c1305ws = new C1305ws();
        c1305ws.f33670b = "crash";
        c1305ws.f33669a = j2;
        c1305ws.f33675g = (byte) (c1305ws.f33675g | 1);
        iq0 iq0VarM6715h = ia5.f21227r.m6715h(context);
        int i2 = ((C0958nt) iq0VarM6715h).f26074c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        C1379ys c1379ys = new C1379ys();
        c1379ys.f35486d = boolValueOf;
        c1379ys.f35487e = iq0VarM6715h;
        c1379ys.f35488f = ia5.m6710f(context);
        c1379ys.f35489g = i;
        c1379ys.f35490h = (byte) (c1379ys.f35490h | 1);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c1283w7.f33129e;
        C0737ht c0737ht = new C0737ht();
        String name2 = thread.getName();
        if (name2 == null) {
            xy4.m12782k("Null name");
            return null;
        }
        c0737ht.f20832a = name2;
        c0737ht.f20833b = 4;
        c0737ht.f20835d = (byte) (c0737ht.f20835d | 1);
        List listM11604d = uq0.m11604d(stackTraceElementArr, 4);
        if (listM11604d == null) {
            xy4.m12782k("Null frames");
            return null;
        }
        c0737ht.f20834c = listM11604d;
        arrayList.add(c0737ht.m6503a());
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (!key.equals(thread)) {
                StackTraceElement[] stackTraceElementArrMo8265a2 = ys2Var.mo8265a(entry.getValue());
                C0737ht c0737ht2 = new C0737ht();
                String name3 = key.getName();
                if (name3 == null) {
                    xy4.m12782k("Null name");
                    return null;
                }
                c0737ht2.f20832a = name3;
                c0737ht2.f20833b = 0;
                c0737ht2.f20835d = (byte) (c0737ht2.f20835d | 1);
                List listM11604d2 = uq0.m11604d(stackTraceElementArrMo8265a2, 0);
                if (listM11604d2 == null) {
                    xy4.m12782k("Null frames");
                    return null;
                }
                c0737ht2.f20834c = listM11604d2;
                arrayList.add(c0737ht2.m6503a());
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C0625et c0625etM11603c = uq0.m11603c(c1283w7, 0);
        C0663ft c0663ft = new C0663ft();
        c0663ft.f19265a = "0";
        c0663ft.f19266b = "0";
        c0663ft.f19267c = 0L;
        c0663ft.f19268d = (byte) (c0663ft.f19268d | 1);
        C0700gt c0700gtM5803a = c0663ft.m5803a();
        List listM11605a = uq0Var.m11605a();
        if (listM11605a == null) {
            xy4.m12782k("Null binaries");
            return null;
        }
        C0466at c0466at = new C0466at();
        c0466at.f14847a = listUnmodifiableList;
        c0466at.f14848b = c0625etM11603c;
        c0466at.f14849c = null;
        c0466at.f14850d = c0700gtM5803a;
        c0466at.f14851e = listM11605a;
        VarHandle.storeStoreFence();
        c1379ys.f35483a = c0466at;
        c1305ws.f33671c = c1379ys.m13230a();
        c1305ws.f33672d = uq0Var.m11606b(i);
        C1342xs c1342xsM12388a = c1305ws.m12388a();
        z32 z32Var = (z32) c0602e8.f17870d;
        if1 if1Var = (if1) c0602e8.f17871e;
        ((wq0) c0602e8.f17868b).m12374d(C0602e8.m4946i(C0602e8.m4945h(c1342xsM12388a, z32Var, if1Var, w71.f33134a), if1Var), str, true);
        try {
            if1 if1Var2 = np0Var.f25999g;
            String str5 = ".ae" + j4;
            if1Var2.getClass();
            if (!new File((File) if1Var2.f21326c, str5).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w(str4, "Could not create app exception marker file.", e);
        }
        np0Var.m8807a(false, c1372yl3, false);
        np0Var.m8808b(new w50().f33102a, Boolean.FALSE);
        if (!np0Var.f25994b.m3668a()) {
            return y62.m12936B(null);
        }
        nr6 nr6Var = ((li4) ((AtomicReference) c1372yl3.f35311h).get()).f24059a;
        yq0 yq0Var = (yq0) np0Var.f25997e.f22481b;
        ar3 ar3Var = new ar3((byte) 18);
        ar3Var.f14813b = this;
        VarHandle.storeStoreFence();
        return nr6Var.m8827k(yq0Var, ar3Var);
    }
}
