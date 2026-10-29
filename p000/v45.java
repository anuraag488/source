package p000;

import ads_mobile_sdk.a22;
import ads_mobile_sdk.b02;
import ads_mobile_sdk.b22;
import ads_mobile_sdk.s41;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v45 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32394a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f32395b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f32396c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f32397d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32398e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f32399f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f32400g;

    public /* synthetic */ v45(byte b) {
        this.f32394a = b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f32394a) {
            case 0:
                String str = this.f32395b;
                String str2 = this.f32396c;
                String str3 = this.f32397d;
                Long l = (Long) this.f32398e;
                Long l2 = (Long) this.f32399f;
                b02 b02Var = (b02) this.f32400g;
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", str);
                data.putExtra("eventLocation", str2);
                data.putExtra("description", str3);
                if (l != null) {
                    data.putExtra("beginTime", l.longValue());
                }
                if (l2 != null) {
                    data.putExtra("endTime", l2.longValue());
                }
                data.setFlags(268435456);
                b02Var.f822c.m1916a(data);
                break;
            default:
                b22 b22Var = (b22) this.f32398e;
                String str4 = this.f32395b;
                String str5 = this.f32396c;
                String str6 = this.f32397d;
                Activity activity = (Activity) this.f32399f;
                lb5.m7910S(b22Var.f836d, null, null, new a22(b22Var, str4, (s41) this.f32400g, str5, str6, activity, null), 3);
                break;
        }
    }
}
