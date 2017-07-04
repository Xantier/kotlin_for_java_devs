/*

Decompiled Beaut.kt

// BeautKt.java
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 6},
        bv = {1, 0, 1},
        k = 2,
        d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\n"},
        d2 = {"yumyum", "LLunch;", "getYumyum", "()LLunch;", "main", "", "args", "", "", "([Ljava/lang/String;)V", "production sources for module kotlin_for_java_devs"}
)
public final class BeautKt {
    @NotNull
    private static final Lunch yumyum = new Lunch("Toast", "Avocado");

    @NotNull
    public static final Lunch getYumyum() {
        return yumyum;
    }

    public static final void main(@NotNull String[] args) {
        Intrinsics.checkParameterIsNotNull(args, "args");
        Function1 buyHouse = (Function1)null.INSTANCE;
        buyHouse.invoke(yumyum);
    }
}
// Lunch.java
import kotlin.Metadata;
        import kotlin.jvm.internal.Intrinsics;
        import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 6},
        bv = {1, 0, 1},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
        d2 = {"LLunch;", "", "bread", "", "topping", "(Ljava/lang/String;Ljava/lang/String;)V", "getBread", "()Ljava/lang/String;", "getTopping", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "production sources for module kotlin_for_java_devs"}
)
public final class Lunch {
    @NotNull
    private final String bread;
    @NotNull
    private final String topping;

    @NotNull
    public final String getBread() {
        return this.bread;
    }

    @NotNull
    public final String getTopping() {
        return this.topping;
    }

    public Lunch(@NotNull String bread, @NotNull String topping) {
        Intrinsics.checkParameterIsNotNull(bread, "bread");
        Intrinsics.checkParameterIsNotNull(topping, "topping");
        super();
        this.bread = bread;
        this.topping = topping;
    }

    @NotNull
    public final String component1() {
        return this.bread;
    }

    @NotNull
    public final String component2() {
        return this.topping;
    }

    @NotNull
    public final Lunch copy(@NotNull String bread, @NotNull String topping) {
        Intrinsics.checkParameterIsNotNull(bread, "bread");
        Intrinsics.checkParameterIsNotNull(topping, "topping");
        return new Lunch(bread, topping);
    }

    // $FF: synthetic method
    // $FF: bridge method
    @NotNull
    public static Lunch copy$default(Lunch var0, String var1, String var2, int var3, Object var4) {
        if((var3 & 1) != 0) {
            var1 = var0.bread;
        }

        if((var3 & 2) != 0) {
            var2 = var0.topping;
        }

        return var0.copy(var1, var2);
    }

    public String toString() {
        return "Lunch(bread=" + this.bread + ", topping=" + this.topping + ")";
    }

    public int hashCode() {
        return (this.bread != null?this.bread.hashCode():0) * 31 + (this.topping != null?this.topping.hashCode():0);
    }

    public boolean equals(Object var1) {
        if(this != var1) {
            if(var1 instanceof Lunch) {
                Lunch var2 = (Lunch)var1;
                if(Intrinsics.areEqual(this.bread, var2.bread) && Intrinsics.areEqual(this.topping, var2.topping)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}

*/
