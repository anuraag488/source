package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e86 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17896a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f17897b;

    /* JADX INFO: renamed from: c */
    public boolean f17898c;

    /* JADX INFO: renamed from: d */
    public Object f17899d;

    public e86(zr6 zr6Var, boolean z) {
        this.f17899d = zr6Var;
        this.f17898c = z;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4962a(Context context, IntentFilter intentFilter) {
        if (this.f17897b) {
            return;
        }
        context.registerReceiver(this, intentFilter, true != this.f17898c ? 4 : 2);
        this.f17897b = true;
    }

    /* JADX INFO: renamed from: b */
    public void m4963b() {
        qm6 qm6Var = (qm6) this.f17899d;
        qm6Var.m9962k0();
        qm6Var.mo9020c().mo5038t();
        qm6Var.mo9020c().mo5038t();
        if (this.f17897b) {
            qm6Var.mo9019b().f16831L.m12504a("Unregistering connectivity change receiver");
            this.f17897b = false;
            this.f17898c = false;
            try {
                qm6Var.f28602l.f26509a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                qm6Var.mo9019b().f16835j.m12505b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m4964c(Context context) {
        if (!this.f17897b) {
            qv5.m10140h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f17897b = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4965d(Bundle bundle, f00 f00Var, int i, xd6 xd6Var, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            nz5 nz5Var = ((zr6) this.f17899d).f36326c;
            if (byteArray != null) {
                ((pq3) nz5Var).m9623v(yc6.m13093u(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((pq3) nz5Var).m9623v(kz5.m7757b(23, i, f00Var, null, xd6Var), j, z);
            }
        } catch (Throwable unused) {
            qv5.m10140h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xd6 xd6Var;
        f00 f00VarM10137e;
        nz5 nz5Var;
        int iIntValue;
        switch (this.f17896a) {
            case 0:
                qm6 qm6Var = (qm6) this.f17899d;
                qm6Var.m9962k0();
                String action = intent.getAction();
                qm6Var.mo9019b().f16831L.m12505b(action, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    q76 q76Var = qm6Var.f28592b;
                    qm6.m9925S(q76Var);
                    boolean zM9785O = q76Var.m9785O();
                    if (this.f17898c != zM9785O) {
                        this.f17898c = zM9785O;
                        ea6 ea6VarMo9020c = qm6Var.mo9020c();
                        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 26);
                        runnableC1029pc.f27515b = this;
                        VarHandle.storeStoreFence();
                        ea6VarMo9020c.m5033D(runnableC1029pc);
                    }
                } else {
                    qm6Var.mo9019b().f16838m.m12505b(action, "NetworkBroadcastReceiver received unknown action");
                }
                break;
            default:
                zr6 zr6Var = (zr6) this.f17899d;
                nz5 nz5Var2 = zr6Var.f36326c;
                C1163sz c1163sz = zr6Var.f36325b;
                String action2 = intent.getAction();
                int iHashCode = action2.hashCode();
                xd6 xd6Var2 = xd6.f34177d;
                xd6 xd6Var3 = xd6.f34176c;
                xd6 xd6Var4 = xd6.f34178e;
                if (iHashCode != -1484087650) {
                    if (iHashCode != -337612916) {
                        if (iHashCode == 345207161 && action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                            xd6Var = xd6Var4;
                        } else {
                            xd6Var = xd6.f34175b;
                        }
                    } else if (action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        xd6Var = xd6Var2;
                    } else {
                        xd6Var = xd6.f34175b;
                    }
                } else if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                    xd6Var = xd6Var3;
                } else {
                    xd6Var = xd6.f34175b;
                }
                int i = (xd6Var.equals(xd6Var2) || xd6Var.equals(xd6Var4)) ? 2 : xd6Var.equals(xd6Var3) ? 32 : 1;
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (i == 2) {
                        int i2 = qv5.f28836a;
                        e00 e00VarM5438a = f00.m5438a();
                        e00VarM5438a.f17552a = qv5.m10133a("BillingBroadcastManager", intent.getExtras());
                        Bundle extras2 = intent.getExtras();
                        if (extras2 == null) {
                            qv5.m10140h("BillingBroadcastManager", "Unexpected null bundle received!");
                        } else {
                            Object obj = extras2.get("SUB_RESPONSE_CODE");
                            if (obj == null) {
                                qv5.m10139g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                            } else {
                                if (obj instanceof Integer) {
                                    iIntValue = ((Integer) obj).intValue();
                                } else {
                                    qv5.m10140h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                                }
                                e00VarM5438a.f17553b = iIntValue;
                                e00VarM5438a.f17554c = qv5.m10138f("BillingBroadcastManager", intent.getExtras());
                                f00VarM10137e = e00VarM5438a.m4828e();
                            }
                        }
                        iIntValue = 0;
                        e00VarM5438a.f17553b = iIntValue;
                        e00VarM5438a.f17554c = qv5.m10138f("BillingBroadcastManager", intent.getExtras());
                        f00VarM10137e = e00VarM5438a.m4828e();
                    } else {
                        f00VarM10137e = qv5.m10137e(intent, "BillingBroadcastManager");
                    }
                    long j = extras.getLong("billingClientTransactionId", 0L);
                    boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
                    if (xd6Var.equals(xd6Var3) || xd6Var.equals(xd6Var2)) {
                        f00 f00Var = f00VarM10137e;
                        int i3 = i;
                        bw5 bw5Var = zr6Var.f36330g;
                        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        ArrayList arrayList = new ArrayList();
                        if (stringArrayList == null || stringArrayList2 == null) {
                            nz5Var = nz5Var2;
                            ji3 ji3VarM10142j = qv5.m10142j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), bw5Var);
                            if (ji3VarM10142j == null) {
                                qv5.m10139g("BillingHelper", "Couldn't find single purchase data as well.");
                            } else {
                                arrayList.add(ji3VarM10142j);
                            }
                        } else {
                            nz5Var = nz5Var2;
                            qv5.m10139g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                            for (int i4 = 0; i4 < stringArrayList.size() && i4 < stringArrayList2.size(); i4++) {
                                ji3 ji3VarM10142j2 = qv5.m10142j(stringArrayList.get(i4), stringArrayList2.get(i4), bw5Var);
                                if (ji3VarM10142j2 != null) {
                                    arrayList.add(ji3VarM10142j2);
                                }
                            }
                        }
                        if (f00Var.f18622a == 0) {
                            fd6 fd6VarM7758c = kz5.m7758c(i3, xd6Var);
                            pq3 pq3Var = (pq3) nz5Var;
                            pq3Var.getClass();
                            try {
                                bd6 bd6Var = (bd6) fd6VarM7758c.m10543l();
                                af6 af6Var = (af6) fd6VarM7758c.m5698s().m10543l();
                                af6Var.m8971b();
                                if6.m6793r((if6) af6Var.f26373b, z);
                                bd6Var.m8971b();
                                fd6.m5696u((fd6) bd6Var.f26373b, (if6) af6Var.m8970a());
                                fd6 fd6Var = (fd6) bd6Var.m8970a();
                                re6 re6Var = (re6) pq3Var.f27896b;
                                if (j != 0) {
                                    pe6 pe6Var = (pe6) re6Var.m10543l();
                                    pe6Var.m9505e(j);
                                    re6Var = (re6) pe6Var.m8970a();
                                }
                                pq3Var.m9604D(fd6Var, re6Var);
                            } catch (Throwable th) {
                                qv5.m10141i("BillingLogger", "Unable to log.", th);
                            }
                        } else {
                            m4965d(extras, f00Var, i3, xd6Var, j, z);
                        }
                        c1163sz.m10956b(f00Var);
                        break;
                    } else if (xd6Var.equals(xd6Var4)) {
                        if (f00VarM10137e.f18622a != 0) {
                            f00 f00Var2 = f00VarM10137e;
                            m4965d(extras, f00Var2, i, xd6Var, j, z);
                            uu5 uu5Var = sv5.f30597b;
                            mw5 mw5Var = mw5.f25264e;
                            c1163sz.m10956b(f00Var2);
                        } else {
                            qv5.m10140h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                            f00 f00Var3 = rz5.f29765h;
                            ((pq3) nz5Var2).m9623v(kz5.m7757b(141, i, f00Var3, null, xd6Var), j, z);
                            uu5 uu5Var2 = sv5.f30597b;
                            mw5 mw5Var2 = mw5.f25264e;
                            c1163sz.m10956b(f00Var3);
                        }
                    }
                } else {
                    qv5.m10140h("BillingBroadcastManager", "Bundle is null.");
                    f00 f00Var4 = rz5.f29765h;
                    ((pq3) nz5Var2).m9620s(kz5.m7757b(11, i, f00Var4, null, xd6Var));
                    if (c1163sz != null) {
                        c1163sz.m10956b(f00Var4);
                    }
                }
                break;
        }
    }

    public /* synthetic */ e86() {
    }
}
