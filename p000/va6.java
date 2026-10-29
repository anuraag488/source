package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class va6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32498a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cp6 f32499b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ jc6 f32500c;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f32498a) {
            case 0:
                qm6 qm6Var = this.f32500c.f22167a;
                qm6Var.m9928A();
                qm6Var.m9943W(this.f32499b);
                break;
            case 1:
                qm6 qm6Var2 = this.f32500c.f22167a;
                qm6Var2.m9928A();
                cp6 cp6Var = this.f32499b;
                if (qm6Var2.f28615y != null) {
                    ArrayList arrayList = new ArrayList();
                    qm6Var2.f28616z = arrayList;
                    arrayList.addAll(qm6Var2.f28615y);
                }
                ar5 ar5Var = qm6Var2.f28593c;
                qm6.m9925S(ar5Var);
                oa6 oa6Var = (oa6) ar5Var.f36084a;
                String str = cp6Var.f16349d;
                y42.m12854a0(str);
                y42.m12851X(str);
                ar5Var.mo5038t();
                ar5Var.m10368u();
                try {
                    SQLiteDatabase sQLiteDatabaseM3197l0 = ar5Var.m3197l0();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseM3197l0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM3197l0.delete("upload_queue", "app_id=?", strArr);
                    if (oa6Var.f26512d.m9225E(null, e56.f17795i1)) {
                        iDelete += sQLiteDatabaseM3197l0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16831L.m12506c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e) {
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12506c("Error resetting analytics data. appId, error", d76.m4401y(str), e);
                }
                if (cp6Var.f16356k) {
                    qm6Var2.m9943W(cp6Var);
                }
                break;
            case 2:
                jc6 jc6Var = this.f32500c;
                cp6 cp6Var2 = this.f32499b;
                qm6 qm6Var3 = jc6Var.f22167a;
                qm6Var3.m9928A();
                qm6Var3.m9966m0(cp6Var2);
                break;
            default:
                jc6 jc6Var2 = this.f32500c;
                cp6 cp6Var3 = this.f32499b;
                qm6 qm6Var4 = jc6Var2.f22167a;
                qm6Var4.m9928A();
                qm6Var4.m9964l0(cp6Var3);
                break;
        }
    }
}
