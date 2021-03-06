package edu.hit.software.se160132.entity;

import edu.hit.software.se160132.entity.constraint.Mutable;
import edu.hit.software.se160132.entity.constraint.Priced;
import edu.hit.software.se160132.entity.constraint.SomeGoods;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.PositiveOrZero;
import java.time.Instant;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class ShelfItem implements Mutable, SomeGoods, Priced {
    @Id
    @GeneratedValue
    private Long id;
    private Long goods;
    @PositiveOrZero
    private Integer amount;
    private Long price;
    private Long shelf;
    @Version
    private Long version;
    @LastModifiedDate
    private Instant lastModified;
    @CreatedDate
    private Instant created;

    @Override
    public Instant getCreated() {
        return created;
    }

    @Override
    public void setCreated(Instant created) {
        this.created = created;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getGoods() {
        return goods;
    }

    @Override
    public void setGoods(Long goods) {
        this.goods = goods;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getShelf() {
        return shelf;
    }

    public void setShelf(Long shelf) {
        this.shelf = shelf;
    }

    @Override
    public Long getVersion() {
        return version;
    }

    @Override
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public Instant getLastModified() {
        return lastModified;
    }

    @Override
    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }
}
