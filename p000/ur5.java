package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ur5 extends km5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1235ux f32121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur5(AbstractC1235ux abstractC1235ux, Looper looper) {
        super(looper, (byte) 3);
        this.f32121a = abstractC1235ux;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        bn5 bn5Var;
        AbstractC1235ux abstractC1235ux = this.f32121a;
        int i = abstractC1235ux.zzd.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (bn5Var = (bn5) message.obj) != null) {
                synchronized (bn5Var) {
                    bn5Var.f15440a = null;
                }
                AbstractC1235ux abstractC1235ux2 = bn5Var.f15442c;
                synchronized (abstractC1235ux2.zzj()) {
                    abstractC1235ux2.zzj().remove(bn5Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !abstractC1235ux.isConnecting()) {
            bn5 bn5Var2 = (bn5) message.obj;
            if (bn5Var2 != null) {
                synchronized (bn5Var2) {
                    bn5Var2.f15440a = null;
                }
                AbstractC1235ux abstractC1235ux3 = bn5Var2.f15442c;
                synchronized (abstractC1235ux3.zzj()) {
                    abstractC1235ux3.zzj().remove(bn5Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            abstractC1235ux.zzn(new lk0(message.arg2, null, null));
            if (abstractC1235ux.zzg() && !abstractC1235ux.zzo()) {
                abstractC1235ux.m11676b(3, null);
                return;
            }
            lk0 lk0VarZzm = abstractC1235ux.zzm() != null ? abstractC1235ux.zzm() : new lk0(8, null, null);
            abstractC1235ux.zzc.mo3671d(lk0VarZzm);
            int i5 = lk0VarZzm.f24097e;
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            lk0 lk0VarZzm2 = abstractC1235ux.zzm() != null ? abstractC1235ux.zzm() : new lk0(8, null, null);
            abstractC1235ux.zzc.mo3671d(lk0VarZzm2);
            int i6 = lk0VarZzm2.f24097e;
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            abstractC1235ux.zzc.mo3671d(new lk0(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            abstractC1235ux.m11676b(5, null);
            if (abstractC1235ux.zzk() != null) {
                abstractC1235ux.zzk().onConnectionSuspended(message.arg2);
            }
            abstractC1235ux.onConnectionSuspended();
            abstractC1235ux.zze(5, 1, null);
            return;
        }
        if (i4 == 2 && !abstractC1235ux.isConnected()) {
            bn5 bn5Var3 = (bn5) message.obj;
            if (bn5Var3 != null) {
                synchronized (bn5Var3) {
                    bn5Var3.f15440a = null;
                }
                AbstractC1235ux abstractC1235ux4 = bn5Var3.f15442c;
                synchronized (abstractC1235ux4.zzj()) {
                    abstractC1235ux4.zzj().remove(bn5Var3);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i7);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        bn5 bn5Var4 = (bn5) message.obj;
        synchronized (bn5Var4) {
            try {
                bool = bn5Var4.f15440a;
                if (bn5Var4.f15441b) {
                    String string = bn5Var4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC1235ux abstractC1235ux5 = bn5Var4.f15445f;
            int i8 = bn5Var4.f15443d;
            if (i8 != 0) {
                abstractC1235ux5.m11676b(1, null);
                Bundle bundle = bn5Var4.f15444e;
                bn5Var4.mo3639b(new lk0(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!bn5Var4.mo3638a()) {
                abstractC1235ux5.m11676b(1, null);
                bn5Var4.mo3639b(new lk0(8, null, null));
            }
        }
        synchronized (bn5Var4) {
            bn5Var4.f15441b = true;
        }
        synchronized (bn5Var4) {
            bn5Var4.f15440a = null;
        }
        AbstractC1235ux abstractC1235ux6 = bn5Var4.f15442c;
        synchronized (abstractC1235ux6.zzj()) {
            abstractC1235ux6.zzj().remove(bn5Var4);
        }
    }
}
