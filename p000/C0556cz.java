package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: cz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0556cz {

    /* JADX INFO: renamed from: a */
    public final j25 f16620a;

    /* JADX INFO: renamed from: b */
    public final Context f16621b;

    /* JADX INFO: renamed from: e */
    public Object f16624e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ byte f16626g;

    /* JADX INFO: renamed from: c */
    public final Object f16622c = new Object();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f16623d = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final o30 f16625f = new o30(this);

    public C0556cz(Context context, j25 j25Var, byte b) {
        this.f16626g = b;
        this.f16620a = j25Var;
        this.f16621b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public final IntentFilter m4235a() {
        switch (this.f16626g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m4236b() {
        byte b = this.f16626g;
        Context context = this.f16621b;
        boolean z = true;
        switch (b) {
            case 0:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    wn2.m12326e().m12329c(AbstractC0592dz.f17509a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    wn2.m12326e().m12329c(AbstractC0631ez.f18586a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = context.registerReceiver(null, m4235a());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4237c(Boolean bool) {
        synchronized (this.f16622c) {
            Object obj = this.f16624e;
            if (obj == null || !obj.equals(bool)) {
                this.f16624e = bool;
                List listM6319e1 = hb0.m6319e1(this.f16623d);
                bu3 bu3Var = this.f16620a.f21976e;
                RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 6);
                runnableC1285w9.f33164b = listM6319e1;
                runnableC1285w9.f33165c = this;
                VarHandle.storeStoreFence();
                bu3Var.execute(runnableC1285w9);
            }
        }
    }
}
