package p000;

import ads_mobile_sdk.ah2;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: wg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1292wg extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33347a = 1;

    /* JADX INFO: renamed from: b */
    public Object f33348b;

    /* JADX INFO: renamed from: c */
    public Object f33349c;

    /* JADX INFO: renamed from: d */
    public Object f33350d;

    /* JADX INFO: renamed from: e */
    public Object f33351e;

    /* JADX INFO: renamed from: f */
    public Object f33352f;

    /* JADX INFO: renamed from: g */
    public Object f33353g;

    /* JADX INFO: renamed from: h */
    public Serializable f33354h;

    /* JADX INFO: renamed from: i */
    public Object f33355i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292wg(zo0 zo0Var, C1367yg c1367yg, C0459am c0459am, Class cls, Method method, ContentResolver contentResolver, String str, Integer num) {
        super(null);
        this.f33348b = zo0Var;
        this.f33349c = c1367yg;
        this.f33350d = c0459am;
        this.f33351e = cls;
        this.f33352f = method;
        this.f33353g = contentResolver;
        this.f33354h = str;
        this.f33355i = num;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.f33347a) {
            case 0:
                lb5.m7910S((zo0) this.f33348b, null, null, new C1255vg((C1367yg) this.f33349c, (C0459am) this.f33350d, (Class) this.f33351e, (Method) this.f33352f, (ContentResolver) this.f33353g, (String) this.f33354h, (Integer) this.f33355i, null), 3);
                break;
            default:
                if (!((AtomicBoolean) this.f33354h).getAndSet(true)) {
                    ((ExecutorService) this.f33355i).submit(new ah2(this));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C1292wg(Handler handler) {
        super(handler);
    }
}
