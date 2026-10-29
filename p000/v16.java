package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v16 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public f00 f32319a;

    /* JADX INFO: renamed from: b */
    public boolean f32320b;

    /* JADX INFO: renamed from: c */
    public pq3 f32321c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pq3 pq3Var = this.f32321c;
        if (intent == null) {
            qv5.m10140h("ProxyBillingReceiver", "Null intent!");
            return;
        }
        qv5.m10139g("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        if (Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                qv5.m10140h("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                if (pq3Var != null) {
                    pq3Var.m9626y(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            e00 e00VarM5438a = f00.m5438a();
            e00VarM5438a.f17552a = intent.getIntExtra("RESPONSE_CODE", 0);
            String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
            if (stringExtra == null) {
                stringExtra = "";
            }
            e00VarM5438a.f17554c = stringExtra;
            f00 f00VarM4828e = e00VarM5438a.m4828e();
            this.f32319a = f00VarM4828e;
            if (pq3Var != null) {
                pq3Var.m9626y(f00VarM4828e, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            qv5.m10140h("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
            return;
        }
        this.f32320b = true;
        if (pq3Var != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            try {
                ie6 ie6VarM8693q = ne6.m8693q();
                ie6VarM8693q.m8971b();
                ne6.m8698v((ne6) ie6VarM8693q.f26373b, 4);
                xd6 xd6Var = xd6.f34180g;
                ie6VarM8693q.m8971b();
                ne6.m8694r((ne6) ie6VarM8693q.f26373b, xd6Var);
                ne6 ne6Var = (ne6) ie6VarM8693q.m8970a();
                mf6 mf6VarM8705s = nf6.m8705s();
                re6 re6Var = (re6) pq3Var.f27896b;
                if (longExtra != 0) {
                    pe6 pe6Var = (pe6) re6Var.m10543l();
                    pe6Var.m9505e(longExtra);
                    re6Var = (re6) pe6Var.m8970a();
                }
                mf6VarM8705s.m8296c(re6Var);
                mf6VarM8705s.m8971b();
                nf6.m8709w((nf6) mf6VarM8705s.f26373b, ne6Var);
                ((li0) pq3Var.f27897c).m7984m((nf6) mf6VarM8705s.m8970a());
            } catch (Throwable th) {
                qv5.m10141i("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
