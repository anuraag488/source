package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.invoke.VarHandle;
import org.chromium.net.ProxyChangeListener;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o30 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26312a;

    /* JADX INFO: renamed from: b */
    public Object f26313b;

    public o30(C0556cz c0556cz) {
        this.f26312a = (byte) 0;
        this.f26313b = c0556cz;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f26312a) {
            case 0:
                C0556cz c0556cz = (C0556cz) this.f26313b;
                switch (c0556cz.f16626g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            wn2.m12326e().m12328b(AbstractC0592dz.f17509a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        c0556cz.m4237c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        c0556cz.m4237c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        c0556cz.m4237c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        c0556cz.m4237c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            wn2.m12326e().m12328b(AbstractC0631ez.f18586a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        c0556cz.m4237c(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    c0556cz.m4237c(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            wn2.m12326e().m12328b(uc4.f31786a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        c0556cz.m4237c(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    c0556cz.m4237c(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 1:
                oa6 oa6Var = (oa6) this.f26313b;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if (action4 != null) {
                        int iHashCode3 = action4.hashCode();
                        if (iHashCode3 != -1928239649) {
                            if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                d76 d76Var = oa6Var.f26514f;
                                oa6.m9016l(d76Var);
                                d76Var.f16831L.m12504a("[sgtm] App Receiver notified batches are available");
                                ea6 ea6Var = oa6Var.f26515g;
                                oa6.m9016l(ea6Var);
                                fk6 fk6Var = new fk6((byte) 4);
                                fk6Var.f19064b = this;
                                VarHandle.storeStoreFence();
                                ea6Var.m5033D(fk6Var);
                            }
                            break;
                        } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            ho6.m6466a();
                            if (oa6Var.f26512d.m9225E(null, e56.f17750Q0)) {
                                d76 d76Var2 = oa6Var.f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16831L.m12504a("App receiver notified triggers are available");
                                ea6 ea6Var2 = oa6Var.f26515g;
                                oa6.m9016l(ea6Var2);
                                fk6 fk6Var2 = new fk6((byte) 5);
                                fk6Var2.f19064b = oa6Var;
                                VarHandle.storeStoreFence();
                                ea6Var2.m5033D(fk6Var2);
                                break;
                            }
                        }
                        d76 d76Var3 = oa6Var.f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16838m.m12504a("App receiver called with unknown action");
                    } else {
                        d76 d76Var4 = oa6Var.f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16838m.m12504a("App receiver called with null action");
                    }
                } else {
                    d76 d76Var5 = oa6Var.f26514f;
                    oa6.m9016l(d76Var5);
                    d76Var5.f16838m.m12504a("App receiver called with null intent");
                }
                break;
            default:
                int i = f51.f18769a;
                if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                    ((ProxyChangeListener) this.f26313b).updateProxyConfigFromConnectivityManager(intent);
                }
                break;
        }
    }

    public /* synthetic */ o30(byte b) {
        this.f26312a = b;
    }
}
