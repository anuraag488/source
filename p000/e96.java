package p000;

import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.QuicException;
import java.lang.invoke.VarHandle;
import org.chromium.net.CronetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class e96 {
    /* JADX INFO: renamed from: a */
    public static final d96 m5028a(Object obj, Object obj2) {
        d96 d96Var = (d96) obj;
        d96 d96Var2 = (d96) obj2;
        if (!d96Var2.isEmpty()) {
            if (!d96Var.f16878a) {
                if (d96Var.isEmpty()) {
                    d96Var = new d96();
                } else {
                    d96 d96Var3 = new d96(d96Var);
                    d96Var3.f16878a = true;
                    d96Var = d96Var3;
                }
            }
            d96Var.m4412b();
            if (!d96Var2.isEmpty()) {
                d96Var.putAll(d96Var2);
            }
        }
        return d96Var;
    }

    /* JADX INFO: renamed from: b */
    public static CronetException m5029b(Exception exc) {
        if (!gr2.m6121A(exc)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (gr2.m6122B(exc)) {
            QuicException quicExceptionM6132h = gr2.m6132h(exc);
            be6 be6Var = new be6(quicExceptionM6132h.getMessage(), null);
            be6Var.f15227a = new bc6(quicExceptionM6132h, true);
            bc6.m3548a(be6Var, quicExceptionM6132h);
            VarHandle.storeStoreFence();
            return be6Var;
        }
        if (gr2.m6123C(exc)) {
            return new bc6(gr2.m6131g(exc), false);
        }
        if (gr2.m6124D(exc)) {
            CallbackException callbackExceptionM3269b = as5.m3269b(exc);
            return new gv5(callbackExceptionM3269b.getMessage(), callbackExceptionM3269b.getCause());
        }
        HttpException httpExceptionM3271d = as5.m3271d(exc);
        return new nr5(httpExceptionM3271d.getMessage(), httpExceptionM3271d);
    }
}
