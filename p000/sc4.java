package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.invoke.VarHandle;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sc4 {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f30160c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static sc4 f30161d;

    /* JADX INFO: renamed from: a */
    public ReentrantLock f30162a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f30163b;

    /* JADX INFO: renamed from: a */
    public static sc4 m10627a(Context context) {
        y42.m12854a0(context);
        ReentrantLock reentrantLock = f30160c;
        reentrantLock.lock();
        try {
            sc4 sc4Var = f30161d;
            if (sc4Var == null) {
                Context applicationContext = context.getApplicationContext();
                sc4Var = new sc4();
                sc4Var.f30162a = new ReentrantLock();
                sc4Var.f30163b = applicationContext.getSharedPreferences("com.google.android.gms.signin", 0);
                VarHandle.storeStoreFence();
                f30161d = sc4Var;
            }
            return sc4Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m10628b(String str) {
        ReentrantLock reentrantLock = this.f30162a;
        reentrantLock.lock();
        try {
            return this.f30163b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
