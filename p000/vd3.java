package p000;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vd3 {

    /* JADX INFO: renamed from: a */
    public String f32533a;

    /* JADX INFO: renamed from: b */
    public Object f32534b = new h60();

    /* JADX INFO: renamed from: c */
    public volatile Object f32535c;

    public vd3(Class cls) {
        this.f32533a = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public Logger m11815a() {
        Logger logger = (Logger) this.f32535c;
        if (logger != null) {
            return logger;
        }
        synchronized (((h60) this.f32534b)) {
            try {
                Logger logger2 = (Logger) this.f32535c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f32533a);
                this.f32535c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
