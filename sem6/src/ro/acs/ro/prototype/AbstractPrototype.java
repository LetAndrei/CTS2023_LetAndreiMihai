package ro.acs.ro.prototype;

public interface AbstractPrototype extends Cloneable {
	public AbstractPrototype createACopy() throws CloneNotSupportedException;
}
