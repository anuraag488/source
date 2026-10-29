package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fm6 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ tn6 f19127a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            tn6 tn6Var = this.f19127a;
            synchronized (tn6Var.f31279a) {
                try {
                    bj6 bj6Var = (bj6) message.obj;
                    mk6 mk6Var = (mk6) tn6Var.f31279a.get(bj6Var);
                    if (mk6Var != null && mk6Var.f24985a.isEmpty()) {
                        if (mk6Var.f24987c) {
                            bj6 bj6Var2 = mk6Var.f24989e;
                            tn6 tn6Var2 = mk6Var.f24991g;
                            tn6Var2.f31281c.removeMessages(1, bj6Var2);
                            tn6Var2.f31282d.m3131B(tn6Var2.f31280b, mk6Var);
                            mk6Var.f24987c = false;
                            mk6Var.f24986b = (byte) 2;
                        }
                        tn6Var.f31279a.remove(bj6Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        tn6 tn6Var3 = this.f19127a;
        synchronized (tn6Var3.f31279a) {
            try {
                bj6 bj6Var3 = (bj6) message.obj;
                mk6 mk6Var2 = (mk6) tn6Var3.f31279a.get(bj6Var3);
                if (mk6Var2 != null && mk6Var2.f24986b == 3) {
                    String strValueOf = String.valueOf(bj6Var3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = mk6Var2.f24990f;
                    if (componentName == null) {
                        bj6Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        bj6Var3.getClass();
                        componentName = new ComponentName("com.google.android.gms", "unknown");
                    }
                    mk6Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
